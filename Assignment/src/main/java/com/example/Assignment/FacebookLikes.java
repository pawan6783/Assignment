package com.example.Assignment;

import java.util.Scanner;

public class FacebookLikes {

	String findFacebookLikes(String []str) {
		
		int size = str.length;
		String result = "";
		if(size == 0) {
			result = "no one likes this";
		}
		else if(size == 1) {
			result = str[0]+" likes this";
		}
		else if(size == 2) {
			result = str[0]+" and "+str[1]+" like this";
		}
		else if(size == 3) {
			result = str[0]+", "+str[1]+" and "+str[2]+" like this";
		}
		else if(size == 4) {
			result = str[0]+", "+str[1]+" and "+(size-2)+" others like this";
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter size of array:");
		
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		String []str = new String[size];

		System.out.println("Enter names:");
		for(int i=0; i<size; i++) {
			str[i] = sc.next();
		}
		
		FacebookLikes fl = new FacebookLikes();
		String result = fl.findFacebookLikes(str);
		System.out.println(result);
		
	}

}
