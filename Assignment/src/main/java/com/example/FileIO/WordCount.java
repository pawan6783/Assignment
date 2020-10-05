package com.example.FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class FileWordCount {

	public int countWords(File file) throws IOException {
		
		FileReader fr = new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		int count=0;String str="";
		while((str=br.readLine())!= null) {
			String words[]=str.split(" ");
			count=count+words.length;
		}
		br.close();
		return count;
	}
}

public class WordCount {
	
	public static void main(String[]args) throws IOException{
		File file = new File("C:\\Users\\pawan\\git\\repository\\Assignment\\demo.txt");
		FileWordCount wcd = new FileWordCount();
		int wordCount = wcd.countWords(file);
		System.out.println("No. of words : "+wordCount);
	}
}
