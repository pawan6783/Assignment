package com.example.BasicInheritance1;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StaticDemoTest {
	
	StaticDemo sd = null;
	
	@Before
	public void setUp() {
		sd = new StaticDemo();
	}
	
	@Test
	public void Test1() {
	    Student.setCollege("Bansal");
	    
	    assertEquals("Bansal", Student.getCollege());
	}
	
	@Test
	public void Test2() {
		Student s1 = new Student(5, "harry");
		s1.setCollege("IET");
		
		assertEquals("IET", s1.getCollege());
	}
}

