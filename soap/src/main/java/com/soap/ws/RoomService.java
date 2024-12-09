package com.soap.ws;

import com.soap.entities.Room;
import com.soap.repositories.RoomRepository;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@WebService(serviceName = "RoomWS")
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    @WebMethod
    public List<Room> getRooms() {
        return roomRepository.findAll();
    }

    @WebMethod
    public Room getRoomById(@WebParam(name = "id") Long id) {
        return roomRepository.findById(id).orElse(null);
    }

    @WebMethod
    public Room createRoom(@WebParam(name = "roomNumber") String roomNumber,
                           @WebParam(name = "type") String type,
                           @WebParam(name = "pricePerNight") double pricePerNight,
                           @WebParam(name = "available") boolean available) {
        Room room = new Room(null, roomNumber, type, pricePerNight, available);
        return roomRepository.save(room);
    }

    @WebMethod
    public boolean deleteRoom(@WebParam(name = "id") Long id) {
        if (roomRepository.existsById(id)) {
            roomRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @WebMethod
    public Room updateRoomAvailability(@WebParam(name = "id") Long id,
                                       @WebParam(name = "available") boolean available) {
        Room room = roomRepository.findById(id).orElse(null);
        if (room != null) {
            room.setAvailable(available);
            return roomRepository.save(room);
        }
        return null;
    }
}