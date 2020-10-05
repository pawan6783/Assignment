package com.example.FileIO;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class LineCountTest {
	LineCountDemo lcd = null;
	
	@Before
	public void setUp() {
		lcd = new LineCountDemo();
	}
	
	@Test
	public void Test1() throws IOException{
		File file = new File("C:\\Users\\pawan\\git\\repository\\Assignment\\demo.txt");
		assertEquals(2, lcd.countLines(file));
	}
	

}
