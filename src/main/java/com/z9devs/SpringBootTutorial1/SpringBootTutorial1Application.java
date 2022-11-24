package com.z9devs.SpringBootTutorial1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootTutorial1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootTutorial1Application.class, args);
		
		Laptop lp = context.getBean(Laptop.class);
		lp.setBrand("Samsung");
		Person p = context.getBean(Person.class);
		p.setName("Mario");
		Person p2 = context.getBean(Person.class);
		p2.setName("Giacomo");
		p.show();
		p2.show();
		lp.setBrand("LP");
		p.show();
		p2.show();
	}
}
