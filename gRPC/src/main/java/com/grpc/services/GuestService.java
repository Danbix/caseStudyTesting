package com.grpc.services;

import com.grpc.entities.Guest;
import com.grpc.repositories.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {

    @Autowired
    private GuestRepository guestRepository;

    // Get a guest by ID
    public Guest getGuestById(Long id) {
        return guestRepository.findById(id).orElseThrow(() -> new RuntimeException("Guest not found"));
    }

    // Get all guests
    public List<Guest> getAllGuests() {
        return guestRepository.findAll();
    }

    // Create a new guest
    public Guest createGuest(Guest guest) {
        return guestRepository.save(guest);
    }

    // Update a guest
    public Guest updateGuest(Long id, Guest guestDetails) {
        Guest guest = guestRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Guest not found"));

        guest.setFirstName(guestDetails.getFirstName());
        guest.setLastName(guestDetails.getLastName());
        guest.setEmail(guestDetails.getEmail());
        guest.setPhoneNumber(guestDetails.getPhoneNumber());

        return guestRepository.save(guest);
    }

    // Delete a guest
    public void deleteGuest(Long id) {
        Guest guest = guestRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Guest not found"));
        guestRepository.delete(guest);
    }
}
