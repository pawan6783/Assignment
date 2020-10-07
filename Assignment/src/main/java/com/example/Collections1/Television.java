package com.example.Collections1;

public class Television {
	private String company; 
	private String type;
	private boolean enabled3D;
	private double price;

	public Television(String company,String type,boolean enabled3D,double price) {

		this.company=company;
		this.enabled3D=enabled3D;
		this.price=price;
		this.type=type;
	}

	public boolean equals(Object o) {
		if(o!=null&&this!=null && o instanceof Car) {
			if(this.company==((Television)o).company&& this.type==((Television)o).type&&this.price==((Television)o).price)
			return true;
		}
		return false;	
	}
	 public int hashCode(){

	        return company.hashCode() * type.hashCode();
	 }
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isEnabled3D() {
		return enabled3D;
	}
	public void setEnabled3D(boolean enabled3d) {
		enabled3D = enabled3d;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
