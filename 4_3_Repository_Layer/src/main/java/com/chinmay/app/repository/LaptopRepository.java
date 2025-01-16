package com.chinmay.app.repository;

import org.springframework.stereotype.Repository;

import com.chinmay.app.model.Laptop;

@Repository
public class LaptopRepository {

	public void save(Laptop lap) {
System.out.println("Laptop Data Saved Successfully");		
	}

	public LaptopRepository()
	{
		System.out.println("Constructor of Laptop Repository Layer");
	}
	
}
