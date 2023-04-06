package com.example.demo.Controller;

import com.example.demo.Message;
import com.example.demo.Service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @Autowired
    private KafkaProducer kafkaProducer;

    @PostMapping("/message")
    public void sendMessage(@RequestBody Message message) {
        kafkaProducer.sendMessage(message);
    }
}