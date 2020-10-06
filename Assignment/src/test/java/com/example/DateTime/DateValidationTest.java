package com.example.DateTime;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DateValidationTest {

	DateValidationDemo dvd = null;
	
	@Before
	public void setUp() {
		dvd = new DateValidationDemo();
	}
	
	@Test
	public void test1() {
		assertEquals(true, dvd.getDate("06/10/2020"));
		assertEquals("09/10/2020", dvd.getFutureDate(3));
	}
}
