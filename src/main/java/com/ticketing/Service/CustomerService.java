package com.ticketing.Service;

import com.ticketing.Model.Customer;
import com.ticketing.Model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class CustomerService {
    @Autowired
    private TicketService ticketService;

    public Ticket buyTicket(Customer customer) throws IOException{
        return ticketService.buyTicket();
    }
}