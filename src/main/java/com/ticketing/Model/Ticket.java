package com.ticketing.Model;

public class Ticket {
    private String id;
    private String status;

    public Ticket(){}

    public Ticket(String id, String status){
        this.id = id;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}