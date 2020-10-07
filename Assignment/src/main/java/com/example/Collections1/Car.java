package com.example.Collections1;

public class Car implements Comparable<Car>{

	private String make;
	private String model;
	private int year;
	private double price;
	
	public Car(String make,String model,int year,double price) {
		this.make=make;
		this.model=model;
		this.price=price;
		this.year=year;
	}	

	
	@Override
	public boolean equals(Object o) {
		if(o!=null&&this!=null ) {
			if(this.make==((Car)o).make&& this.model==((Car)o).model)
			return true;
		}
		return false;	
	}	  
	 public int hashCode(){

	        return make.hashCode() * model.hashCode();
	    }
		
	 public int compareTo(Car obj) {
		 int com=this.make.compareTo(obj.make);
		 if(com>0) {
			 return 1;
		 }
		 else if(com<0) {
			 return -1;
		 }
		 else
			 return 0;
	 }

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
