package com.example.Assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class OddCountTest {
	OddCount oc = null;
	
	@Before
	public void setUp() {
		oc = new OddCount();
	}
	
	@Test
	public void Test1() {
		int arr[] = {20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};
		assertEquals(5, oc.findOddFrequencyElement(arr));
	}
	
	@Test
	public void Test2() {
		int arr[] = {1,1,2,-2,5,2,4,4,-1,-2,5};
		assertEquals(-1, oc.findOddFrequencyElement(arr));
	}
	
	@Test
	public void Test3() {
		int arr[] = {20,1,1,2,2,3,3,5,5,4,20,4,5};
		assertEquals(5, oc.findOddFrequencyElement(arr));
	}
	
	@Test
	public void Test4() {
		int arr[] = {1,1,1,1,1,1,10,1,1,1,1};
		assertEquals(10, oc.findOddFrequencyElement(arr));
	}
}
