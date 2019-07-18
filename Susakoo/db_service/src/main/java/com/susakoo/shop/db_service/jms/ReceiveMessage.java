package com.susakoo.shop.db_service.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveMessage {

	@JmsListener(destination = "sampleQueue")
	public void receiveMessage(String msg) {
		System.out.println("Received :" + msg);
		

	}

}
