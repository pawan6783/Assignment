package com.example.Assignment4;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.example.EmployeeAssignment.Employee;

public class EmployeeTest {
	Employee e = null;
	
	@Before
	public void setUp() {
		e = new Employee(1,"Max Johnson",50000);
	}
	
	@Test
	public void Test1() {
		assertEquals(1, e.getId());
	}
	
	@Test
	public void Test2() {
		assertEquals("Max Johnson", e.getName());
	}
	
	@Test
	public void Test3() {
		assertEquals(50000, e.getMonthlyBasic());
	}
	
	@Test
	public void Test4() {
		assertEquals(600000, e.getAnnualBasic());
	}
	
	@Test
	public void Test5() {
		assertEquals(924600, e.getAnnualGrossSalary());
	}
	
	@Test
	public void Test6() {
		assertEquals(71950, e.getMonthlyTakeHome());
	}
	
	@Test
	public void Test7() {
		assertEquals(863400, e.getAnnualTakeHome());
	}
}
