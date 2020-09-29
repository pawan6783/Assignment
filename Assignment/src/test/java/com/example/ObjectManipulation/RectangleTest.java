package com.example.ObjectManipulation;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RectangleTest {


	Rectangle r,r2 = null;

	@Before
	public void setUp() {
		r = new Rectangle(5, 10);
		r2 = new Rectangle(2, 3);
	}
	
	@Test
	public void Test1() {
		assertEquals(5, r.getLength());
		assertEquals(10, r.getBreadth());
		assertEquals(50, r.getArea());
		assertEquals(30, r.getPerimeter());
		assertEquals(false, Rectangle.compareArea(r, r2));
	}
}
