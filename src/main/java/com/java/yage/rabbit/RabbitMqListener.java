package com.java.yage.rabbit;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;

/**
 * Description:
 *
 * @Author:Jinmu Date: 2018/6/26
 */
@Service("rabbitMQConnector")
public class RabbitMqListener implements MessageListener {

    @Override
    public void onMessage(Message message) {
        try {
            System.out.println("消息内容:"+new String(message.getBody(),"UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
