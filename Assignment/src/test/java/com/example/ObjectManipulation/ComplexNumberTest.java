package com.example.ObjectManipulation;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ComplexNumberTest {

	ComplexNumber cn = null;
	ComplexNumber c1 = null;
	ComplexNumber c2 = null;
	
	@Before
	public void setUp() {
		cn = new ComplexNumber();
	    c1 = new ComplexNumber();
	    c2 = new ComplexNumber();
	}
	
	@Test
	public void Test1() {
		c1.setReal(5f);
		c1.setImaginary(10f);
		c2.setReal(2f);
		c2.setImaginary(3f);
		
		assertEquals(5, c1.getReal(),0.5);
		assertEquals(10, c1.getImaginary(),0.5);
		assertEquals(2, c2.getReal(),0.5);
		assertEquals(3, c2.getImaginary(),0.5);
		
		ComplexNumber c3 = ComplexNumber.sum(c1, c2);
		assertEquals(7, c3.getReal(),0.5);
		assertEquals(13, c3.getImaginary(),0.5);
		
	}
}
