package com.example.ObjectManipulation;

import java.util.Scanner;

public class Time {
	
	private int hrs;
	private int mins;
	
	public int getHrs() {
		return hrs;
	}
	public int getMins() {
		return mins;
	}
	
	public void setHrs(int hrs) {
		this.hrs=hrs;
	}
	
	public void setMins(int mins) {
		this.mins=mins;
	}
	
	public String showTime() {
		if(getHrs() < 10)
			return ("Time: 0"+ getHrs() +":"+ getMins()).toString();
		else if(getMins() < 10)
			return ("Time: "+ getHrs() +":0"+ getMins()).toString();
		else
			return ("Time: "+ getHrs() +":"+ getMins()).toString();
	}
	
	public static Time sumTime(Time t1, Time t2) {
		Time t3= new Time();
		
		t3.setHrs( t1.hrs+t2.hrs);
		if(t1.mins+t2.mins >= 60) {
			t3.setHrs(t3.hrs+1);
			t3.setMins((t1.mins+t2.mins) - 60);
		}
		else
			t3.setMins(t1.mins+t2.mins);
		return t3;
	}
	
	public static void main(String[] args) {
		Time t1 = new Time();
		Time t2 = new Time();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hr. and min. for clock1");
		t1.setHrs(sc.nextInt());
		t1.setMins(sc.nextInt());
				
		System.out.println("Enter hr. and min. for clock2");
		t2.setHrs(sc.nextInt());
		t2.setMins(sc.nextInt());
		
		Time t3 = Time.sumTime(t1, t2);
		System.out.println("Time in clock 3 : " + t3.showTime());
	}
}
