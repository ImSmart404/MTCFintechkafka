package com.example.demo.Service;

import com.example.demo.Message;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @KafkaListener(topics = "test")
    public void receive(Message message) {
        System.out.println("Received message: " + message.getContent());
    }
}