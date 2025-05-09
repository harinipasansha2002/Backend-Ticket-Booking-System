package com.ticketing.Service;

import com.ticketing.Model.Ticket;
import com.ticketing.Model.Vendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class VendorService {
    @Autowired
    private TicketService ticketService;

    public void addTickets(Vendor vendor, int count) throws IOException{
        for (int i = 0; i < count; i++){
            Ticket ticket = new Ticket("T" + i, "Available");
            ticketService.addTicket(ticket);
        }
    }
}