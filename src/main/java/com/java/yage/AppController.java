package com.java.yage;

import com.java.yage.kafka.KafkaMessageProducer;
import com.java.yage.rabbit.RabbitMqSendManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @Author:Jinmu Date: 2018/6/26
 */
@RestController
public class AppController {

    @Autowired
    private KafkaMessageProducer kafkaMessageProducer;

    @Autowired
    private RabbitMqSendManager rabbitMqSendManager;

    @RequestMapping("/test/kafka")
    public String sendKafkaMessage(){
        kafkaMessageProducer.sendKafka();
        return "发送kafka消息成功!";
    }

    @RequestMapping("/test/rabbit")
    public String sendRabbitMessage(){
        rabbitMqSendManager.sendMessage();
        return "发送rabbit消息成功!";
    }
}
