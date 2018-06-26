package com.java.yage.kafka;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JavaMomApplicationTests {

	@Autowired
	private KafkaMessageProducer kafkaMessageProducer;

	@Autowired
	private KafkaMessageConsumer kafkaMessageConsumer;

	@Test
	public void setValueTest() {
//        kafkaMessageProducer.sendKafka();
		try {
			Thread.sleep(50000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
