package com.soap.config;

import com.soap.entities.Reservation;
import com.soap.ws.GuestService;
import com.soap.ws.ReservationService;
import com.soap.ws.RoomService;
import lombok.AllArgsConstructor;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class CxfConfig {

    private RoomService roomService;
    private GuestService guestService;
    private ReservationService reservationService;
    private Bus bus;

    @Bean
    public EndpointImpl roomendpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, roomService);
        endpoint.publish("/ws");
        return endpoint;
    }

    @Bean
    public EndpointImpl guestendpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, guestService);
        endpoint.publish("/ws2");
        return endpoint;
    }

    @Bean
    public EndpointImpl reservationendpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, reservationService);
        endpoint.publish("/ws3");
        return endpoint;
    }
}
