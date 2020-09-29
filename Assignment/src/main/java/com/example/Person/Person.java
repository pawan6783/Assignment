package com.example.Person;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {

	private String name;
	private LocalDate dob; 
	
    public Person(String name, int d, int m, int y)
	{ 
    	this.name=name;
    	dob=LocalDate.of(y,m,d);
	}
	public String getName() {
		return name;
	}
	
	public String getDob() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return formatter.format(dob);
	}
	
	private String getAge() {
		LocalDate currentDate= LocalDate.now();
		int days=currentDate.getDayOfMonth()-dob.getDayOfMonth();
		int months=currentDate.getMonthValue()-dob.getMonthValue();
		int years=currentDate.getYear()-dob.getYear();
		return ("Age: "+years+" years "+months+" months "+days+" days ");
	}
	public void display()
	{    System.out.println("Person details: ");
	     System.out.println("Name: "+name);
	     System.out.println("Date Of Birth: "+getDob());
	     System.out.println(getAge());
	}
	public String olderOne(Person p) //method to identify the older of the two persons.
	{   
		if(this.dob.isBefore(p.dob)) {
			Period period=Period.between(this.dob,p.dob);
			return (this.name+" is older than "+p.name+" by "+period.getYears()+" Years, "+period.getMonths()+" Months, "+period.getDays()+" Days");
		}
		
		else {
			Period period=Period.between(p.dob,this.dob);
			return (p.name+" is older than "+this.name+" by "+period.getYears()+" Years, "+period.getMonths()+" Months, "+period.getDays()+" Days");
		}

	}
	
	public static void main(String[] args) {
		Person person1=new Person("Ram", 5, 6, 1980);
		Person person2=new Person("Shyam", 2, 3, 1987);
		person1.display();
		person2.display();
		System.out.println(person1. olderOne(person2));
	}

}