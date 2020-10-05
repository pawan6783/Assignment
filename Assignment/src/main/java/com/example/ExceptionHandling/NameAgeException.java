package com.example.ExceptionHandling;

class NameNotValidException extends Exception {

	
	public NameNotValidException(String s) {
		System.out.println(s);
	}
}

class AgeNotWithinRangeException extends Exception{

	public AgeNotWithinRangeException(String s) {
		System.out.println(s);
	}
}

class Student {

	private String name;
	private int age;
	
	public Student(String name,int age) throws NameNotValidException, AgeNotWithinRangeException{
		this.name = name;
		this.age = age;
		
		if(isName(name))
		{
			if(isAge(age)) {
				this.name=name;
				this.age=age;				
			}
			else throw new  AgeNotWithinRangeException("Age is not between 15-21");	
		}
		else throw new NameNotValidException("Name can have characters only");
	}
	
	public boolean isName(String name)  {
        name.toLowerCase();
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)>=97&&name.charAt(i)<=122)
				continue;
			else
				return false;				
		}
		return true;	
	}
	public boolean isAge(int age)  {
		if(age>=15&&age<=21)
		return true;
		else
		return false;
	}

	public String getName() {
		return name;
	}

	

	public int getAge() {
		return age;
	}

	
}

public class NameAgeException {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Student st = new Student("jon$", 20);
		st.getName();
		st.getAge();
		
	}

}
