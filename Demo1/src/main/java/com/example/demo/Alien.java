package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("lap1")
public class Alien {

	private int aid;
	
	xzcg hzkbvz m;
	private String name;
	private String tech;
	@Autowired
	@Qualifier("lap1")
	private Laptop laptop;
	
	
	public Alien() {
		super();
		
		System.out.println("object created");
	}

	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
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
	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public void show() {
		// TODO Auto-generated method stub
       System.out.println("in show");
       laptop.Compile();
	}
	
	
}
