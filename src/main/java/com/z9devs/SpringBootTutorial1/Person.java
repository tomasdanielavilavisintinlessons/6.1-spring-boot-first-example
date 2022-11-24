package com.z9devs.SpringBootTutorial1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// @Component rende la classe uno Spring Bean
@Component
// Di default i Bean di Spring hanno scope "singleton", quindi vengono
// istanziati una sola volta per applicazione. 
// Con scope "prototype" invece non ha più scope "singleton" e viene creata
// più di un'istanza
@Scope(value="prototype")
public class Person 
{
	private int id;
	private String name;
	private String tech;
	// Annotazione usata per fare dependency injection
	@Autowired
	// @Qualifier è annotazione per cercare per nome. Autowired cerca per 
	// tipo (per classe) non per nome. Con qualifier si può cercare per nome
	@Qualifier("lap1")
	private Laptop laptop;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	public void show() 
	{
		System.out.println("Sono " + this.name);
		laptop.print();
	}
}