package com.soap.ws;

import com.soap.entities.Guest;
import com.soap.entities.Reservation;
import com.soap.entities.Room;
import com.soap.repositories.GuestRepository;
import com.soap.repositories.ReservationRepository;
import com.soap.repositories.RoomRepository;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
@WebService(serviceName = "ReservationWS")
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private GuestRepository guestRepository;

    @Autowired
    private RoomRepository roomRepository;

    @WebMethod
    public List<Reservation> getReservations() {
        return reservationRepository.findAll();
    }

    @WebMethod
    public Reservation getReservationById(@WebParam(name = "id") Long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    @WebMethod
    public Reservation createReservation(@WebParam(name = "checkInDate") Date checkInDate,
                                         @WebParam(name = "checkOutDate") Date checkOutDate,
                                         @WebParam(name = "totalCost") double totalCost,
                                         @WebParam(name = "guestId") Long guestId,
                                         @WebParam(name = "roomId") Long roomId) {
        Guest guest = guestRepository.findById(guestId).orElse(null);
        Room room = roomRepository.findById(roomId).orElse(null);

        if (guest != null && room != null) {
            Reservation reservation = new Reservation();
            reservation.setCheckInDate(checkInDate);
            reservation.setCheckOutDate(checkOutDate);
            reservation.setTotalCost(totalCost);
            reservation.setGuest(guest);
            reservation.setRoom(room);

            return reservationRepository.save(reservation);
        }

        return null; // Or throw a custom exception for invalid guest/room
    }

    @WebMethod
    public boolean deleteReservation(@WebParam(name = "id") Long id) {
        if (reservationRepository.existsById(id)) {
            reservationRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @WebMethod
    public Reservation updateReservation(@WebParam(name = "id") Long id,
                                         @WebParam(name = "checkInDate") Date checkInDate,
                                         @WebParam(name = "checkOutDate") Date checkOutDate,
                                         @WebParam(name = "totalCost") double totalCost) {
        Reservation reservation = reservationRepository.findById(id).orElse(null);
        if (reservation != null) {
            reservation.setCheckInDate(checkInDate);
            reservation.setCheckOutDate(checkOutDate);
            reservation.setTotalCost(totalCost);

            return reservationRepository.save(reservation);
        }
        return null;
    }
}
