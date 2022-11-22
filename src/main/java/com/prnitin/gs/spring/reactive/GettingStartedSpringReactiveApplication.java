package com.prnitin.gs.spring.reactive;

import com.prnitin.gs.spring.reactive.greeting.GreetingClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GettingStartedSpringReactiveApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(GettingStartedSpringReactiveApplication.class, args);

		GreetingClient client = context.getBean(GreetingClient.class);

		System.out.println(">> message = " + client.getMessage().block());
	}

}
