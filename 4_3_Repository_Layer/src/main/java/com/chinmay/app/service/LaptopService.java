package com.chinmay.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinmay.app.model.Laptop;
import com.chinmay.app.repository.LaptopRepository;

@Service
public class LaptopService {
	
	public LaptopService() {
           System.out.println("LaptopService Object Created");
	}
	@Autowired
	public LaptopRepository repo;	
	public void addlap(Laptop lap)
	{
          repo.save(lap);	  
	}
	public boolean isGoodLap(Laptop lap)
	{
		return true;
	}

}
