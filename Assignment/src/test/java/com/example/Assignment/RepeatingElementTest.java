package com.example.Assignment;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

public class RepeatingElementTest {
	
	RepeatingElement re = null;
	@Before
	public void setUp() {
		re = new RepeatingElement();
	}
	
	@Test
	public void test1() {
		HashMap<Character,Integer> result = new HashMap<Character, Integer>();
		result.put('a', 2);
		result.put('b', 2);
		
		assertEquals(result, re.getRepeatingElement("aabBcde"));
	}
	
	@Test
	public void test2() {
		HashMap<Character,Integer> result = new HashMap<Character, Integer>();
		
		assertEquals(result, re.getRepeatingElement("abcde"));
	}
	
	@Test
	public void test3() {
		HashMap<Character,Integer> result = new HashMap<Character, Integer>();
		result.put('i', 6);
		
		assertEquals(result, re.getRepeatingElement("indivisibility" ));
	}
	
	@Test
	public void test4() {
		HashMap<Character,Integer> result = new HashMap<Character, Integer>();
		result.put('a', 2);
		result.put('1', 2);
		
		assertEquals(result, re.getRepeatingElement("aA11" ));
	}

}
