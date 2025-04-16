package ru.aston.PairsChallengeConsumer.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics = "product-events", groupId = "product-events-listener")
    public void listenNewEmployee(String message) {
        System.out.println(message);
    }

}