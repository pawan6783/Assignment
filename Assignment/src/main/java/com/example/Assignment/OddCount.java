package com.example.Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class OddCount {
	
	public int findOddFrequencyElement(int arr[]) {
		
		int n=0;
		HashMap<Integer, Integer> list= new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(list.containsKey(arr[i]))
				list.put(arr[i], list.get(arr[i]) + 1);
			else
				list.put(arr[i], 1);
		}
		
		for(Map.Entry<Integer, Integer> it : list.entrySet()) {
			if((it.getValue() % 2) != 0 ) {
				return it.getKey();
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddCount oc = new OddCount();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		
		System.out.println("Enter elements: ");
		
		int arr[] = new int[size];

		

		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
			
		int result;
		result = oc.findOddFrequencyElement(arr);
		
		System.out.println("Odd frequency element:"+ result);

	}

}
