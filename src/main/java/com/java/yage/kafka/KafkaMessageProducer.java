package com.java.yage.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * Description: kafka管理
 *
 * @Author:Jinmu Date: 2018/6/22
 */
@Component
public class KafkaMessageProducer {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void sendKafka() {
        String value = "This is data,Hello kafka!";
        System.out.println(kafkaTemplate.sendDefault(value));
    }
}
