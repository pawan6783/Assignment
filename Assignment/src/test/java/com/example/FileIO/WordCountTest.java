package com.example.FileIO;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

public class WordCountTest{
	FileWordCount fwc = null;
	
	@Before
	public void setUp() {
		fwc = new FileWordCount();
	}
	
	@Test
	public void test() throws Exception{
		File file = new File("C:\\Users\\pawan\\git\\repository\\Assignment\\demo.txt");
		assertEquals(4, fwc.countWords(file));
	}
}