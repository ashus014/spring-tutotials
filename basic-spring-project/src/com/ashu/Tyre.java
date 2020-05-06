package com.ashu;


public class Tyre {
	
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]";
	}

	public Tyre(String brand) {
		super();
		this.brand = brand;
	}

	

	
	
}
