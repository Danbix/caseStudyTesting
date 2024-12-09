package com.grpc.controllers;

import com.grpc.services.GuestService;

import com.grpc.services.ReservationService;
import com.grpc.services.RoomService;
import com.grpc.stubs.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@GrpcService
public class HotelServiceImpl extends HotelServiceGrpc.HotelServiceImplBase {

     @Autowired
     private GuestService guestService;

    @Autowired
    private RoomService roomService;

    @Autowired
    private ReservationService reservationService;

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public void getGuest(GetGuestRequest request, StreamObserver<Guest> responseObserver) {
        int guestId = request.getId();
        com.grpc.entities.Guest guest = guestService.getGuestById(Long.parseLong(String.valueOf(guestId)));
        responseObserver.onNext(Guest.newBuilder()
                .setId(guest.getId().intValue())
                        .setEmail(guest.getEmail())
                        .setFirstName(guest.getFirstName())
                        .setLastName(guest.getLastName())
                        .setPhoneNumber(guest.getPhoneNumber())
                .build());
        responseObserver.onCompleted();
    }

    @Override
    public void getAllGuests(Empty request, StreamObserver<GuestList> responseObserver) {
        List<Guest> guests = guestService.getAllGuests().stream()
                .map(guest -> Guest.newBuilder()
                        .setId(guest.getId().intValue())
                        .setEmail(guest.getEmail())
                        .setFirstName(guest.getFirstName())
                        .setLastName(guest.getLastName())
                        .setPhoneNumber(guest.getPhoneNumber())
                        .build()).collect(Collectors.toList());

        GuestList guestList = GuestList.newBuilder()
                .addAllGuests(guests)
                .build();
        responseObserver.onNext(guestList);
        responseObserver.onCompleted();
    }

    @Override
    public void createGuest(CreateGuestRequest request, StreamObserver<Guest> responseObserver) {
        com.grpc.entities.Guest guest = new com.grpc.entities.Guest(null, request.getFirstName(), request.getLastName(), request.getEmail(), request.getPhoneNumber());
        com.grpc.entities.Guest createdGuest = guestService.createGuest(guest);
        responseObserver.onNext(Guest.newBuilder()
                .setId(createdGuest.getId().intValue())
                .setEmail(createdGuest.getEmail())
                .setFirstName(createdGuest.getFirstName())
                .setLastName(createdGuest.getLastName())
                .setPhoneNumber(createdGuest.getPhoneNumber())
                .build());
        responseObserver.onCompleted();
    }

    @Override
    public void updateGuest(UpdateGuestRequest request, StreamObserver<Guest> responseObserver) {
        com.grpc.entities.Guest guest = guestService.updateGuest(Long.parseLong(String.valueOf(request.getId()))
                , new com.grpc.entities.Guest(null, request.getFirstName(), request.getLastName(), request.getEmail(), request.getPhoneNumber()));
        responseObserver.onNext(Guest.newBuilder()
                .setId(guest.getId().intValue())
                .setEmail(guest.getEmail())
                .setFirstName(guest.getFirstName())
                .setLastName(guest.getLastName())
                .setPhoneNumber(guest.getPhoneNumber())
                .build());
        responseObserver.onCompleted();
    }

    @Override
    public void deleteGuest(DeleteGuestRequest request, StreamObserver<Guest> responseObserver) {
        guestService.deleteGuest(Long.parseLong(String.valueOf(request.getId())));
        responseObserver.onCompleted();
    }

    @Override
    public void getRoom(GetRoomRequest request, StreamObserver<Room> responseObserver) {
        Long roomId = (long) request.getId();
        com.grpc.entities.Room roomEntity = roomService.getRoomById(roomId);

        if (roomEntity!=null) {
            Room grpcRoom = Room.newBuilder()
                    .setId(roomEntity.getId().intValue())  // Convert Long to int
                    .setRoomNumber(roomEntity.getRoomNumber())
                    .setType(roomEntity.getType())
                    .setPricePerNight(Float.parseFloat(String.valueOf(roomEntity.getPricePerNight())))
                    .setAvailable(roomEntity.isAvailable())
                    .build();
            responseObserver.onNext(grpcRoom);
            responseObserver.onCompleted();
        } else {
            responseObserver.onError(new Throwable("Room not found"));
        }
    }

    @Override
    public void getAllRooms(Empty request, StreamObserver<RoomList> responseObserver) {
        List<com.grpc.entities.Room> rooms = roomService.getAllRooms();
        RoomList.Builder roomListBuilder = RoomList.newBuilder();

        for (com.grpc.entities.Room room : rooms) {
            Room grpcRoom = Room.newBuilder()
                    .setId(room.getId().intValue())  // Convert Long to int
                    .setRoomNumber(room.getRoomNumber())
                    .setType(room.getType())
                    .setPricePerNight(Float.parseFloat(String.valueOf(room.getPricePerNight())))
                    .setAvailable(room.isAvailable())
                    .build();
            roomListBuilder.addRooms(grpcRoom);
        }

        responseObserver.onNext(roomListBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void createRoom(CreateRoomRequest request, StreamObserver<Room> responseObserver) {
        com.grpc.entities.Room roomEntity = new com.grpc.entities.Room();
        roomEntity.setRoomNumber(request.getRoomNumber());
        roomEntity.setType(request.getType());
        roomEntity.setPricePerNight(request.getPricePerNight());
        roomEntity.setAvailable(request.getAvailable());

        roomEntity = roomService.createRoom(roomEntity);

        Room grpcRoom = Room.newBuilder()
                .setId(roomEntity.getId().intValue())  // Convert Long to int
                .setRoomNumber(roomEntity.getRoomNumber())
                .setType(roomEntity.getType())
                .setPricePerNight(Float.parseFloat(String.valueOf(roomEntity.getPricePerNight())))
                .setAvailable(roomEntity.isAvailable())
                .build();

        responseObserver.onNext(grpcRoom);
        responseObserver.onCompleted();
    }

    @Override
    public void updateRoom(UpdateRoomRequest request, StreamObserver<Room> responseObserver) {
        Long roomId = (long) request.getId();
        com.grpc.entities.Room roomEntity = new com.grpc.entities.Room();
        roomEntity.setRoomNumber(request.getRoomNumber());
        roomEntity.setType(request.getType());
        roomEntity.setPricePerNight(request.getPricePerNight());
        roomEntity.setAvailable(request.getAvailable());

        com.grpc.entities.Room updatedRoom = roomService.updateRoom(roomId, roomEntity);

        if (updatedRoom!=null) {
            Room grpcRoom = Room.newBuilder()
                    .setId(updatedRoom.getId().intValue())  // Convert Long to int
                    .setRoomNumber(updatedRoom.getRoomNumber())
                    .setType(updatedRoom.getType())
                    .setPricePerNight(Float.parseFloat(String.valueOf(updatedRoom.getPricePerNight())))
                    .setAvailable(updatedRoom.isAvailable())
                    .build();
            responseObserver.onNext(grpcRoom);
            responseObserver.onCompleted();
        } else {
            responseObserver.onError(new Throwable("Room not found"));
        }
    }

    @Override
    public void deleteRoom(DeleteRoomRequest request, StreamObserver<Room> responseObserver) {
        Long roomId = (long) request.getId();
        roomService.deleteRoom(roomId);
        responseObserver.onCompleted();
    }


    @Override
    public void getReservation(GetReservationRequest request, StreamObserver<Reservation> responseObserver) {
        Long reservationId = (long) request.getId(); // Convert int to Long
        com.grpc.entities.Reservation reservation = reservationService.getReservationById(reservationId);
        responseObserver.onNext(Reservation.newBuilder()
                .setId(reservation.getId().intValue())
                .setCheckInDate(reservation.getCheckInDate().toString())
                .setCheckOutDate(reservation.getCheckOutDate().toString())
                .setGuestId(reservation.getGuest().getId().intValue())
                .setRoomId(reservation.getRoom().getId().intValue())
                .setTotalCost(Float.parseFloat(String.valueOf(reservation.getTotalCost())))
                .build());
        responseObserver.onCompleted();
    }

    // Get all reservations
    @Override
    public void getAllReservations(Empty request, StreamObserver<ReservationList> responseObserver) {
        List<com.grpc.entities.Reservation> reservations = reservationService.getAllReservations();
        ReservationList.Builder reservationListBuilder = ReservationList.newBuilder();

        for (com.grpc.entities.Reservation reservation : reservations) {
            reservationListBuilder.addReservations(Reservation.newBuilder()
                    .setId(reservation.getId().intValue())
                    .setCheckInDate(reservation.getCheckInDate().toString())
                    .setCheckOutDate(reservation.getCheckOutDate().toString())
                    .setGuestId(reservation.getGuest().getId().intValue())
                    .setRoomId(reservation.getRoom().getId().intValue())
                    .setTotalCost(Float.parseFloat(String.valueOf(reservation.getTotalCost())))
                    .build());
        }

        responseObserver.onNext(reservationListBuilder.build());
        responseObserver.onCompleted();
    }

    // Create a new reservation
    @Override
    public void createReservation(CreateReservationRequest request, StreamObserver<Reservation> responseObserver) {
        // Map request fields to Reservation entity
        com.grpc.entities.Reservation reservation = new com.grpc.entities.Reservation();


        try {

            Date checkInDate = format.parse(request.getCheckInDate());
            Date checkOutDate = format.parse(request.getCheckOutDate());

            reservation.setCheckInDate(checkInDate);
            reservation.setCheckOutDate(checkOutDate);
        } catch (Exception e) {
            e.printStackTrace();
        }

        reservation.setTotalCost(request.getTotalCost());

        // Set guest and room using the ID from the request
        com.grpc.entities.Guest guest = new com.grpc.entities.Guest();
        guest.setId((long) request.getGuestId());
        com.grpc.entities.Room room = new com.grpc.entities.Room();
        room.setId((long) request.getRoomId());

        reservation.setGuest(guest);
        reservation.setRoom(room);

        com.grpc.entities.Reservation createdReservation = reservationService.createReservation(reservation);
        responseObserver.onNext(Reservation.newBuilder()
                .setId(createdReservation.getId().intValue())
                .setCheckInDate(createdReservation.getCheckInDate().toString())
                .setCheckOutDate(createdReservation.getCheckOutDate().toString())
                .setGuestId(createdReservation.getGuest().getId().intValue())
                .setRoomId(createdReservation.getRoom().getId().intValue())
                .setTotalCost(Float.parseFloat(String.valueOf(createdReservation.getTotalCost())))
                .build());
        responseObserver.onCompleted();
    }

    // Update a reservation
    @Override
    public void updateReservation(UpdateReservationRequest request, StreamObserver<Reservation> responseObserver) {
        Long reservationId = (long) request.getId();

        // Map request fields to Reservation entity
        com.grpc.entities.Reservation  reservationDetails = new com.grpc.entities.Reservation();
        try {

            Date checkInDate = format.parse(request.getCheckInDate());
            Date checkOutDate = format.parse(request.getCheckOutDate());

            reservationDetails.setCheckInDate(checkInDate);
            reservationDetails.setCheckOutDate(checkOutDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
        reservationDetails.setTotalCost(request.getTotalCost());

        com.grpc.entities.Guest guest = new com.grpc.entities.Guest();
        guest.setId((long) request.getGuestId());
        com.grpc.entities.Room room = new com.grpc.entities.Room();
        room.setId((long) request.getRoomId());

        reservationDetails.setGuest(guest);
        reservationDetails.setRoom(room);

        com.grpc.entities.Reservation updatedReservation = reservationService.updateReservation(reservationId, reservationDetails);
        responseObserver.onNext(Reservation.newBuilder()
                .setId(updatedReservation.getId().intValue())
                .setCheckInDate(updatedReservation.getCheckInDate().toString())
                .setCheckOutDate(updatedReservation.getCheckOutDate().toString())
                .setGuestId(updatedReservation.getGuest().getId().intValue())
                .setRoomId(updatedReservation.getRoom().getId().intValue())
                .setTotalCost(Float.parseFloat(String.valueOf(updatedReservation.getTotalCost())))
                .build());
        responseObserver.onCompleted();
    }

    // Delete a reservation
    @Override
    public void deleteReservation(DeleteReservationRequest request, StreamObserver<Reservation> responseObserver) {
        Long reservationId = (long) request.getId();
        reservationService.deleteReservation(reservationId);
        responseObserver.onNext(Reservation.newBuilder().build()); // Return an empty response
        responseObserver.onCompleted();
    }



}
