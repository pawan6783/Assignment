package com.example.DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "";
	
			
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any date in 8 digits: ");
		str=sc.nextLine();
			
		try {
			if(str.length()!=8) {
				throw new Exception("Wrong input");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Invalid Date");
		}
		
		
		String d=""+str.charAt(0)+str.charAt(1)+"/"+str.charAt(2)+str.charAt(3)+"/"+str.charAt(4)+str.charAt(5)+str.charAt(6)+str.charAt(7);
		
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date=LocalDate.parse(d.trim(),formatter);
		
		System.out.println("Date: "+d);
		
		if(date.getDayOfMonth()>10)
			System.out.println("Date : "+date.getDayOfMonth()+" "+date.getMonth()+", "+date.getYear());
		else
			System.out.println("Date : "+"0"+date.getDayOfMonth()+" "+date.getMonth()+", "+date.getYear()); 
	}

}
