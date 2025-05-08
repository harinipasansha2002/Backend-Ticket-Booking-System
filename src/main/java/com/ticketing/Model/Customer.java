package com.ticketing.Model;

public class Customer {
    private String id;
    private String name;

    public Customer(){}

    public Customer(String id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}