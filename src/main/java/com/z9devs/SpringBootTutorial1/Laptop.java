package com.z9devs.SpringBootTutorial1;

import org.springframework.stereotype.Component;

@Component("lap1")
public class Laptop 
{
	private int id;
	private String brand;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void print() {
		System.out.println("Ho un " + this.toString());
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", brand=" + brand + "]";
	}
}
