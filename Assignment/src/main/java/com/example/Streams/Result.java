package com.example.Streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class RandomInteger{
	
	public void getRandomNumber(String path) throws IOException {
		
	    ArrayList<Integer> list=new ArrayList<Integer>();
	    FileWriter fw = new FileWriter(path);
			
	    try(BufferedWriter bw=new BufferedWriter(fw)){
				
			for(int i=0;i<200;i++) {
				int num=(int) (Math.random()*49);
				bw.write(num+"\n");		
			}		
		}
	    FileReader fr = new FileReader(path);
			try(BufferedReader br=new BufferedReader(fr)){
				while(br.readLine()!=null) {
					list.add(Integer.parseInt(br.readLine()));
				}		
			}
			
			list.stream().distinct().sorted().forEach(item->System.out.println(item));
		}
}

public class Result {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub	
		String path = "C:\\Users\\pawan\\git\\repository\\Assignment\\demo.txt";
		
		RandomInteger ri = new RandomInteger();
		ri.getRandomNumber(path);

	}

}
