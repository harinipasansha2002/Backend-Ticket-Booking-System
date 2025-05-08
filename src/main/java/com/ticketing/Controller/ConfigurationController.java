package com.ticketing.Controller;

import com.ticketing.Model.Configuration;
import com.ticketing.Service.ConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/configuration")
public class ConfigurationController {
    @Autowired
    private ConfigurationService configurationService;

    @PostMapping
    public ResponseEntity<String> saveConfiguration(@RequestBody Configuration config){
        try {
            configurationService.saveConfiguration(config);
            return ResponseEntity.ok("Configuration saved successfully.");
        }catch (IOException e){
            return ResponseEntity.status(500).body("Error saving configuration: " + e.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<Configuration> getConfiguration(){
        try {
            Configuration config = configurationService.getConfiguration();
            return ResponseEntity.ok(config);
        }catch (IOException e){
            return ResponseEntity.status(500).body(null);
        }
    }
}