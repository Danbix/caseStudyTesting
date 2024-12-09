package com.grpc.services;

import com.grpc.entities.Guest;
import com.grpc.entities.Reservation;
import com.grpc.entities.Room;
import com.grpc.repositories.GuestRepository;
import com.grpc.repositories.ReservationRepository;
import com.grpc.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private GuestRepository guestRepository;

    @Autowired
    private RoomRepository roomRepository;

    // Get a reservation by ID
    public Reservation getReservationById(Long id) {
        return reservationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reservation not found"));
    }

    // Get all reservations
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    // Create a new reservation
    public Reservation createReservation(Reservation reservation) {
        // Verify if the guest exists
        Guest guest = guestRepository.findById(reservation.getGuest().getId())
                .orElseThrow(() -> new RuntimeException("Guest not found"));

        // Verify if the room exists
        Room room = roomRepository.findById(reservation.getRoom().getId())
                .orElseThrow(() -> new RuntimeException("Room not found"));

        // Set the verified guest and room to the reservation
        reservation.setGuest(guest);
        reservation.setRoom(room);

        // Save and return the reservation
        return reservationRepository.save(reservation);
    }

    // Update a reservation
    public Reservation updateReservation(Long id, Reservation reservationDetails) {
        Reservation reservation = reservationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reservation not found"));

        // Verify if the guest exists
        Guest guest = guestRepository.findById(reservationDetails.getGuest().getId())
                .orElseThrow(() -> new RuntimeException("Guest not found"));

        // Verify if the room exists
        Room room = roomRepository.findById(reservationDetails.getRoom().getId())
                .orElseThrow(() -> new RuntimeException("Room not found"));

        // Update the reservation
        reservation.setCheckInDate(reservationDetails.getCheckInDate());
        reservation.setCheckOutDate(reservationDetails.getCheckOutDate());
        reservation.setTotalCost(reservationDetails.getTotalCost());
        reservation.setGuest(guest);
        reservation.setRoom(room);

        return reservationRepository.save(reservation);
    }

    // Delete a reservation
    public void deleteReservation(Long id) {
        Reservation reservation = reservationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reservation not found"));
        reservationRepository.delete(reservation);
    }
}