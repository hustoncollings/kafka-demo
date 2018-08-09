package com.kafka.kafkaconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "baeldung", group = "group_id")
    public void consume(String message){
        System.out.println("Consumed message: " + message);
    }

}
