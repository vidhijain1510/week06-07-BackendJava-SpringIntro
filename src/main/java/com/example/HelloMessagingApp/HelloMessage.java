package com.example.HelloMessagingApp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloMessage {

    @GetMapping
    public String UC1() {
        return "Hello from BridgeLabz";
    }

    @GetMapping("/hello/query")
    public String UC2(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    @GetMapping("/param/{name}")
    public String UC3(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    @PostMapping("/post")
    public String UC4(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
}
