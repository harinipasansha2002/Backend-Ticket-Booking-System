package com.ticketing.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebSocketController {
    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @PostMapping("/notify")
    public String notifyClients(@RequestBody String message){
        messagingTemplate.convertAndSend("/topic/updates", message);
        return "Notification Sent.";
    }
}