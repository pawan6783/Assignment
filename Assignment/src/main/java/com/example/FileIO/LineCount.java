package com.example.FileIO;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


class LineCountDemo {

	public int countLines(File file) throws IOException{
		FileReader fr = new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		int count=0;
		while(br.readLine()!=null) {
			count++;
		}
		br.close();
		return count;
	}
}

public class LineCount {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\pawan\\git\\repository\\Assignment\\demo.txt");
		
		LineCountDemo lcd = new LineCountDemo();
		int lines = lcd.countLines(file);
		System.out.println(lines);
	}

}
