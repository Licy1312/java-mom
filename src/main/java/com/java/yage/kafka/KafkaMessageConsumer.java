package com.java.yage.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.MessageListener;
import org.springframework.stereotype.Service;

/**
 * Description:
 *
 * @Author:Jinmu Date: 2018/6/22
 */
@Service("kafkaMessageConsumer")
public class KafkaMessageConsumer implements MessageListener<String,String> {
    /**
     * Invoked with data from kafka.
     *
     * @param data the data to be processed.
     */
    @Override
    public void onMessage(ConsumerRecord<String, String> data) {
        System.out.println("消息内容:"+data);
    }
}
