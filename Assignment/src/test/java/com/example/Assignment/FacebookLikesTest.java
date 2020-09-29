package com.example.Assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FacebookLikesTest {

	FacebookLikes fl = null;
	
	@Before
	public void setUp() {
		fl = new FacebookLikes();
	}
	
	@Test
	public void test1() {
		
		String []str = {"Alex", "Jacob", "Mark", "Max"};
		String result = "Alex, Jacob and 2 others like this";
		
		assertEquals(result, fl.findFacebookLikes(str));
	}
	
	@Test
	public void test2() {
		
		String []str = {};
		String result = "no one likes this";
		
		assertEquals(result, fl.findFacebookLikes(str));
	}
	
	@Test
	public void test3() {
		
		String []str = {"Jacob","Alex"};
		String result = "Jacob and Alex like this";
		
		assertEquals(result, fl.findFacebookLikes(str));
	}
	
	@Test
	public void test4() {
		
		String []str = {"Max", "John","Mark"};
		String result = "Max, John and Mark like this";
		
		assertEquals(result, fl.findFacebookLikes(str));
	}
}
