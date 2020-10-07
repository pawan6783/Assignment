package com.example.Collections1;

public class Laptop {

	private String company;
	private String model;
	private String operatingSystem;
	private String processor;
	
	public Laptop(String company,String model, String operatingSystem,String processor) {
		this.company=company;
		this.model=model;
		this.operatingSystem=operatingSystem;
		this.processor=processor;
	}
	
	public boolean equals(Object o) {
		if(o!=null&&this!=null) {
			if(this.model==((Laptop)o).model&& this.company==((Laptop)o).company)
			return true;
		}
		return false;	
	}
	 public int hashCode(){

	        return company.hashCode()*processor.hashCode();
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
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
}
