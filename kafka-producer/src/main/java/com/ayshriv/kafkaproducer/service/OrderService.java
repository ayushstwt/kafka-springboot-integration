package com.ayshriv.kafkaproducer.service;

import com.ayshriv.kafkaproducer.binding.Order;
import com.ayshriv.kafkaproducer.contants.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private KafkaTemplate<String, Order> kafkaTemplate;

    public String addMsg(Order order) {
        // publish msg to kafka topic
        kafkaTemplate.send(AppConstants.TOPIC_NAME, order);

        return "Msg Published To Kafka Topic";
    }
}
