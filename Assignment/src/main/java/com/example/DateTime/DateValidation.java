package com.example.DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

class DateValidationDemo{
	private LocalDate date;
	
	public boolean getDate(String d) {
    try {			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		    date=LocalDate.parse(d,formatter);
			return true;
		}
		catch (DateTimeParseException e) {
			System.out.print("Invalid date");
			return false;
		}
	}
	String getFutureDate(int daysToAdd) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate newdate=date.plusDays(daysToAdd);
		return formatter.format(newdate);
		
	}
}

public class DateValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the date(dd/mm/yyyy): ");
		
		Scanner sc=new Scanner(System.in);
		String d=sc.nextLine();
		
		DateValidationDemo dvd=new DateValidationDemo();
		boolean checkDate=dvd.getDate(d);
		
		if(checkDate) {			
			System.out.println("Entered Date: "+d);
			System.out.print("Enter number of future days: ");
			int daysToAdd=sc.nextInt();
			String result = dvd.getFutureDate(daysToAdd);
			System.out.println(result);
		}
		
	}

}
