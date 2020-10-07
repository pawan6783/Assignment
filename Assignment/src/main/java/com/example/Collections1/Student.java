package com.example.Collections1;

public class Student {
	private int rollno;
	private String name;
	private String likedFruit;
	
	public Student(int rollno, String name, String likedFruit) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.likedFruit = likedFruit;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLikedFruit() {
		return likedFruit;
	}

	public void setLikedFruit(String likedFruit) {
		this.likedFruit = likedFruit;
	}
	
	
	
}
