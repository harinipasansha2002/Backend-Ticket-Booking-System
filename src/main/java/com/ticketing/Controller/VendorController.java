package com.ticketing.Controller;

import com.ticketing.Model.Vendor;
import com.ticketing.Service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class VendorController {
    @Autowired
    private VendorService vendorService;

    @PostMapping("/vendor/addTickets")
    public String addTickets(@RequestParam int count) throws IOException{
        Vendor vendor = new Vendor("Vendor1");
        vendorService.addTickets(vendor, count);
        return "Tickets added!";
    }
}