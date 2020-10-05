package com.example.FileIO;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FileExistTest {
	FileExistDemo fed = null;
	
	@Before
	public void setUp() {
		fed = new FileExistDemo();
	}
	
	@Test
	public void test1() {
		assertEquals(true, fed.isFileExist("C:\\Users\\pawan\\git\\repository\\Assignment\\demo.txt"));
	}
	
	@Test
	public void test2() {
		assertEquals(false, fed.isFileExist("C:\\Users\\git\\repository\\Assignment\\demo.txt"));
	}
}
