package com.java.yage;

import com.java.yage.kafka.KafkaMessageProducer;
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

    @RequestMapping("/test/kafka")
    public String sendMessage(){
        kafkaMessageProducer.sendKafka();
        return "发送kafka消息成功!";
    }
}
