package com.example.Assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LargestNumberTest {

	LargestNumber ln = null;
	
	@Before
	public void setUp() {
		ln = new LargestNumber();
	}
	
	@Test
	public void test1() {
		String result = "654321";
		
		assertEquals(result, ln.findLargestNumber("145263"));
	}
	
	@Test
	public void test2() {
		String result = "54421";
		
		assertEquals(result, ln.findLargestNumber("21445"));
	}
	
	@Test
	public void test3() {
		String result = "9875543221";
		
		assertEquals(result, ln.findLargestNumber("1254859723"));
	}
}
