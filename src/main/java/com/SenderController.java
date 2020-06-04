package com;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SenderController {

    private final Sender sender;

    public SenderController(Sender sender) {
        this.sender = sender;
    }

    @PostMapping("/message")
    public ResponseEntity<String> message(@RequestBody String message) {
        sender.send(message);
        return ResponseEntity.ok("Message received: " + message);
    }
}