package com.ashu;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{

	
	public void drive()
	{
		System.out.println("Ghadi bhaga tiya...");
	}
}
