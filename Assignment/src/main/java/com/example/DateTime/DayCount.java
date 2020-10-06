package com.example.DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DayCount {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.print("Enter date: ");
		
		 Scanner sc=new Scanner(System.in);
		 String str=sc.nextLine();
		
		 DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		 LocalDate date=LocalDate.parse(str,formatter);
		 
		 Period period=Period.between(date, LocalDate.now());
		 System.out.print("You lived "+period.getYears()+" years, "+period.getMonths()+" months and "+period.getDays()+" days");	}

}
