package com.example.HelloMessagingApp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloMessage {

    @GetMapping
    public String UC1() {
        return "Hello from BridgeLabz";
    }

}
