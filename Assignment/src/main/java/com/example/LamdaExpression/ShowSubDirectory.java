package com.example.LamdaExpression;

import java.io.File;
import java.util.Scanner;

public class ShowSubDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter path of directory:");
		
		Scanner sc = new Scanner(System.in);
		String path = sc.nextLine();
		
		try {
			File dir = new File(path);
			File []subDir = dir.listFiles(child -> {return child.isDirectory();});
			
			for(File it: subDir) {
				System.out.println(it.getName());
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
