package com.example.BasicInheritance1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TwoTest {
	First f = null;
	Second s = null;
	
	@Before
	public void setUp() {
		f = new First();
		s = new Second();

	}
	
	@Test
	public void Test1() {
		f.setId(1);
		f.setFirstMessage("First");
		
		assertEquals(1, f.getId());
		assertEquals("First", f.getFirstMessage());
	}
	
	@Test
	public void Test2() {
		s.setId(2);
		s.setSecondMessage("Second");
		
		assertEquals(2, s.getId());
		assertEquals("Second", s.getSecondMessage());
	
	}
}
