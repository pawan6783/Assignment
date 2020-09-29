package com.example.Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class RepeatingElement {
	
	HashMap<Character,Integer> getRepeatingElement(String str){
		
		char []arr = str.toLowerCase().toCharArray();
		
		HashMap<Character, Integer> temp = new HashMap<Character,Integer>();
		HashMap<Character, Integer> result = new HashMap<Character,Integer>();

		
		for(int i=0; i<arr.length; i++) {
			if(temp.containsKey(arr[i])) {
				temp.put(arr[i], temp.get(arr[i])+1);
			}
			else {
				temp.put(arr[i],1);
			}
		}
		
		for(Map.Entry<Character, Integer> each : temp.entrySet()) {
			if(each.getValue() > 1) {
				result.put(each.getKey(),each.getValue());
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string:");
		Scanner sc = new Scanner(System.in);
		

		String str = sc.next();
	
		
		RepeatingElement re = new RepeatingElement();
		
		HashMap<Character, Integer> result = new HashMap<Character,Integer>();
		result = re.getRepeatingElement(str);
		
		System.out.println("Repeating elements: ");
		for(Map.Entry<Character, Integer> each : result.entrySet()) {
				System.out.println(each.getKey()+" : "+each.getValue());
			}
		}

}
