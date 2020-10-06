package com.example.LamdaExpression;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class SortSubDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter path: ");
		
		Scanner sc = new Scanner(System.in);
		String path = sc.nextLine();
		
		File dir = new File(path);
		File[] list = dir.listFiles();

		Arrays.sort(list, (file1, file2) -> {
			if (file1.isDirectory() && !file2.isDirectory())
				return -1;
			else if (!file1.isDirectory() && file2.isDirectory())
				return 1;
			else
				return (file1.compareTo(file2));

		});

		for (File it : list) {
			System.out.println(it.getName());
		}

	}

}
