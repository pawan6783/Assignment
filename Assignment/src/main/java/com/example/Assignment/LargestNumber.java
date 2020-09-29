package com.example.Assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class LargestNumber {
	
	String findLargestNumber(String num) {
		
		Vector<Integer> list = new Vector<Integer>();
		
		
		String str[] = num.split("");
		int size = str.length;
		int arr[] = new int[size];
		
		for(int i=0; i<size; i++) {
			int temp = Integer.parseInt(str[i]);
	         list.add(temp);
	      }
		
		Collections.sort(list);
		Collections.reverse(list);
		
		String result = "";
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			result = result + it.next();
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter size of array:");
		
		Scanner sc = new Scanner(System.in);
		
		String num = sc.next();
		LargestNumber ln = new LargestNumber();
		String result =ln.findLargestNumber(num);
		 
		System.out.println("Largest Number:"+result);
		
	}

}
