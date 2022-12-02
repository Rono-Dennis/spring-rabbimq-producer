package com.example.springrabbimqproducer;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MQConfig {

    public static  final String QUEUE= "message_queue";

    @Bean
    public Queue queue(){
        return new Queue(QUEUE);
    }
}
