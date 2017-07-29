package com.niit.pocono.model;

public class Supplier {
	public class Product {
	private int id;
		private String manufacturer;
		private String details;
	public int getId() {
		return id;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public void setId(int id) {
		this.id = id;
	}
		
	}
}
