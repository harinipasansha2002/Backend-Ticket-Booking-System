package com.ticketing.Service;

import com.ticketing.Model.Ticket;
import com.ticketing.Model.TicketPool;
import org.springframework.stereotype.Service;

@Service
public class TicketPoolService {
    private final TicketPool ticketPool;

    public TicketPoolService(){
        this.ticketPool = new TicketPool();
    }

    public TicketPool getTicketPool(){
        return ticketPool;
    }

    public void addTicketToPool(Ticket ticket){
        ticketPool.addTicket(ticket);
    }

    public Ticket buyTicketFromPool(){
        return ticketPool.buyTicket();
    }

    public int getAvailableTickets(){
        return ticketPool.getAvailableTickets();
    }
}