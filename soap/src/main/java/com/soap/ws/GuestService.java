package com.soap.ws;

import com.soap.entities.Guest;
import com.soap.repositories.GuestRepository;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@WebService(serviceName = "GuestWS")
public class GuestService {

    @Autowired
    private GuestRepository guestRepository;

    @WebMethod
    public List<Guest> getGuests() {
        return guestRepository.findAll();
    }

    @WebMethod
    public Guest getGuestById(@WebParam(name = "id") Long id) {
        return guestRepository.findById(id).orElse(null);
    }

    @WebMethod
    public Guest createGuest(@WebParam(name = "firstName") String firstName,
                             @WebParam(name = "lastName") String lastName,
                             @WebParam(name = "email") String email,
                             @WebParam(name = "phoneNumber") String phoneNumber) {
        Guest guest = new Guest();
        guest.setFirstName(firstName);
        guest.setLastName(lastName);
        guest.setEmail(email);
        guest.setPhoneNumber(phoneNumber);
        return guestRepository.save(guest);
    }

    @WebMethod
    public boolean deleteGuest(@WebParam(name = "id") Long id) {
        if (guestRepository.existsById(id)) {
            guestRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @WebMethod
    public Guest updateGuest(@WebParam(name = "id") Long id,
                             @WebParam(name = "firstName") String firstName,
                             @WebParam(name = "lastName") String lastName,
                             @WebParam(name = "email") String email,
                             @WebParam(name = "phoneNumber") String phoneNumber) {
        Guest guest = guestRepository.findById(id).orElse(null);
        if (guest != null) {
            guest.setFirstName(firstName);
            guest.setLastName(lastName);
            guest.setEmail(email);
            guest.setPhoneNumber(phoneNumber);
            return guestRepository.save(guest);
        }
        return null;
    }
}
