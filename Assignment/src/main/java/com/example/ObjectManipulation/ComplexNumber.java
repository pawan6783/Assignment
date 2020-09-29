package com.example.ObjectManipulation;

import java.util.Scanner;

public class ComplexNumber {
	private float real;
	private float imaginary;
	
	
	
	public float getReal() {
		return real;
	}

	public float getImaginary() {
		return imaginary;
	}
	
	public void setReal(float real) {
		this.real = real;
	}

	public void setImaginary(float imaginary) {
		this.imaginary = imaginary;
	}

	public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2) {
		ComplexNumber c3 = new ComplexNumber();
		c3.setReal(c1.real+c2.real);;
		c3.setImaginary(c1.imaginary + c2.imaginary);;
		return c3;
	}
	
	public static void main(String[] args) {
		ComplexNumber cn1 = new ComplexNumber();
		ComplexNumber cn2 = new ComplexNumber();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter real and imaginary part of 1st complex number:");
		cn1.setReal(sc.nextFloat());
		cn1.setImaginary(sc.nextFloat());
		
		System.out.println("Enter real and imaginary part of 2nd complex number:");
		cn2.setReal(sc.nextFloat());
		cn2.setImaginary(sc.nextFloat());
		
		ComplexNumber cn3 = ComplexNumber.sum(cn1,cn2);
		System.out.println("Complex Number 1 = "+ cn1.getReal() + "+" + cn1.getImaginary() +"i");
		System.out.println("Complex Number 2 = "+ cn2.getReal() + "+" + cn2.getImaginary() +"i");
		System.out.println("Complex Number 3 = "+ cn3.getReal() + "+" + cn3.getImaginary() +"i");
	}
}
