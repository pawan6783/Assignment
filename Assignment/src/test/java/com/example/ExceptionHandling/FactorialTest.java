package com.example.ExceptionHandling;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FactorialTest {
	FactorialDemo fd = null;
	
	@Before
	public void setUp() {
		fd = new FactorialDemo();
	}
	
	@Test
	public void Test1() throws Exception {
		assertEquals(24, fd.factorial(4));
	}
	
	@Test
	public void Test2() throws Exception {
		assertEquals(120, fd.factorial(5));
	}
	
	@Test
	public void Test3() throws Exception {
		assertEquals(720, fd.factorial(6));
	}
}
