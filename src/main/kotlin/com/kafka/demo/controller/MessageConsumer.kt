package com.kafka.demo.controller

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class MessageConsumer {
    @KafkaListener(topics= ["new_transaction"],groupId = "test")
    fun consume(message:String) :Unit {
        println(" message received from topic : $message");
    }
}