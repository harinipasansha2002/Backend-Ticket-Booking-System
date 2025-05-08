package com.ticketing.Controller;

import com.ticketing.Model.Customer;
import com.ticketing.Model.Ticket;
import com.ticketing.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/customer/buyTicket")
    public Ticket buyTicket() throws IOException{
        Customer customer = new Customer("Customer1", "John");
        return customerService.buyTicket(customer);
    }
}