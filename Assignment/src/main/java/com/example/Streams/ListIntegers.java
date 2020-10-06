package com.example.Streams;

import java.util.ArrayList;

public class ListIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=1;i<80;i+=3) {
			int x = (int)(1+Math.random()*90);
			list.add(x);
		
		}
		System.out.println("List of even numbers:");
		list.stream().filter(item->item%2==0).forEach(item->System.out.println(item));
		
		System.out.println("List of odd numbers:");
		list.stream().filter(item->item%2!=0).forEach(item->System.out.println(item));
		
		System.out.println("List of numbers divisible by 6:");
		list.stream().filter(item->item%6==0).forEach(item->System.out.println(item));
		
		System.out.println("List of numbers less than 12 :");
		list.stream().filter(item->item<12).forEach(item->System.out.println(item));
		
		System.out.println("Display all numbers greater than 50");
		list.stream().filter(item->item>50).forEach(item->System.out.println(item));
	}

}
