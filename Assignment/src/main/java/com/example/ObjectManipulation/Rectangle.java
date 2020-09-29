package com.example.ObjectManipulation;

import java.util.Scanner;

public class Rectangle {
	
	private int length;
	private int breadth;
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public int getLength() {
		return this.length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return this.breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public int getArea() {
		return getLength()*getBreadth();
	}

	public int getPerimeter() {
		return 2*(getLength()+getBreadth());
	}

	public static boolean compareArea(Rectangle a, Rectangle b) {
		if(a.getArea() == b.getArea()) {
			return true;
		}
			
		return false;
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter length : ");
		int l = sc.nextInt();
		
		System.out.print("Enter breadth: ");
		int b = sc.nextInt();
		
		Rectangle r=new Rectangle(l,b);
		System.out.println("Area: "+r.getArea());
		System.out.println("Perimeter: "+r.getPerimeter());
	}
}
