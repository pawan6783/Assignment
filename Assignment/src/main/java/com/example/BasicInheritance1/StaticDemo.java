package com.example.BasicInheritance1;

class Student{
	private int id;
	private String name;
	private static String college;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void getInfo() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(college);
	}
	public static String getCollege() {
		return college;
	}
	public static void setCollege(String college) {
		Student.college = college;
	}
	
}

public class StaticDemo {
	
	public static void main(String []args) {
		Student.setCollege("Acropolis");
		System.out.println(Student.getCollege());
		
		Student s1 =  new Student(100,"john");
		s1.getInfo();
		
		Student s2 =  new Student(200,"Max");
		s2.getInfo();
		
	}
	
}
