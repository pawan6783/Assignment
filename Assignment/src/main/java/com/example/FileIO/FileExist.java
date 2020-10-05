package com.example.FileIO;

import java.io.File;
import java.nio.file.Path;
import java.util.Scanner;

class FileExistDemo {

	public boolean isFileExist(String path) {
		File file = new File(path);
		if(file.exists())
			return true;
		return false;
	}

}

public class FileExist{
	public static void main(String[]args) throws Exception{
		
		System.out.println("Enter File path:");
		Scanner sc = new Scanner(System.in);
		
		String path = sc.next();
		FileExistDemo fd = new FileExistDemo();
		
		if(fd.isFileExist(path)) {
			System.out.println("File exist");
		}
		else {
			System.out.println("File does not exist");
		}
	}
}
