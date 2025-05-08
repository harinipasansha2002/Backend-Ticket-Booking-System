package com.ticketing.Model;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class TicketPool {
    private Queue<Ticket> pool;

    public TicketPool() {
        this.pool = new ConcurrentLinkedDeque<>();
    }

    public Queue<Ticket> getPool() {
        return pool;
    }

    public void addTicket(Ticket ticket) {
        this.pool.add(ticket);
    }

    public Ticket buyTicket() {
        return this.pool.poll();
    }

    public int getAvailableTickets(){
        return pool.size();
    }
}