package com.ticketing.Controller;

import com.ticketing.Model.Ticket;
import com.ticketing.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class TicketController {
    @Autowired
    private TicketService ticketService;

    @GetMapping("/tickets")
    public List<Ticket> getTotalTickets() throws IOException{
        return ticketService.getTotalTickets();
    }
}