package com.java.yage.rabbit;

import com.alibaba.fastjson.JSON;
import com.rabbitmq.tools.json.JSONUtil;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Description: 发送管理类
 *
 * @Author:Jinmu Date: 2018/6/26
 */
@Component
public class RabbitMqSendManager {

    @Autowired
    @Qualifier("sendRabbitMqMessage")
    private RabbitTemplate sendRabbitMqMessage;

    public void sendMessage(){
        try {
            QueueDemo queueDemo = new QueueDemo("licy",26,"上海市");
            sendRabbitMqMessage.send(new Message(JSON.toJSONString(queueDemo).getBytes("UTF-8"), new MessageProperties()));
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
