package com.example.DateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class TodayDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date=LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		DayOfWeek day=date.getDayOfWeek();
		Month month=date.getMonth();
		int d=date.getDayOfMonth();
		int year=date.getYear();
		System.out.print(day+", "+month+" "+d+", "+year);
		
	}

}
