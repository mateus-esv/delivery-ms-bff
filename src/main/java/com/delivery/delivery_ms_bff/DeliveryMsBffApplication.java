package com.delivery.delivery_ms_bff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DeliveryMsBffApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryMsBffApplication.class, args);
	}

}
