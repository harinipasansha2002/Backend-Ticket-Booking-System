package com.ticketing.Service;

import com.ticketing.Model.Ticket;
import com.ticketing.Repository.JsonFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class TicketService {
    private final JsonFileRepository<Ticket> ticketRepository;

    @Autowired
    public TicketService(){
        this.ticketRepository = new JsonFileRepository<>("tickets.json");
    }

    public List<Ticket> getTotalTickets() throws IOException{
        return ticketRepository.read(Ticket.class);
    }

    public void addTicket(Ticket ticket) throws IOException{
        List<Ticket> tickets = ticketRepository.read(Ticket.class);
        tickets.add(ticket);
        ticketRepository.write(tickets);
    }

    public Ticket buyTicket() throws IOException{
        List<Ticket> tickets = ticketRepository.read(Ticket.class);
        if (!tickets.isEmpty()){
            Ticket ticket = tickets.remove(0);
            ticket.setStatus("Sold Out");
            ticketRepository.write(tickets);
            return ticket;
        }
        return null;
    }
}