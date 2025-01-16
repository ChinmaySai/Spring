package com.chinmay.app.service;

import org.springframework.stereotype.Service;

import com.chinmay.app.model.Laptop;

@Service
public class LaptopService {
	
	
	public LaptopService() {
           System.out.println("LaptopService Object Created");
	}
	public void addlap(Laptop lap)
	{
	  System.out.println("Laptop add Method called");	
	}
	public boolean isGoodLap(Laptop lap)
	{
		return true;
	}

}
