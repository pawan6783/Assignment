package com.example.Collections1;

public class CellPhone {
	private String company;
	private String model;
	private String description;
	private String operatingSystem;
	private double price;
	
	public CellPhone(String company,String model, String description, String operatingSystem, double price) {
		this.company = company;
		this.model = model;
		this.description = description;
		this.operatingSystem = operatingSystem;
		this.price = price;
	}
	
	public boolean equals(Object o) {
		if(o!=null&&this!=null) {
			if(this.company==((CellPhone)o).company&& this.model==((CellPhone)o).model && this.operatingSystem==((CellPhone)o).operatingSystem)
			return true;
		}
		return false;	
	}
	public int hashCode(){

        return company.hashCode() * operatingSystem.hashCode();
    }
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
