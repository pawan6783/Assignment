package com.example.BasicInheritance1;

class Check{
	private String str1 = "private member";
    String str2 = "default member";
	protected String str3 = "protected member";
	public String str4 = "public member";
	
	public void display() {
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}
}

public class CheckDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check c = new Check();
		
		//System.out.println(c.str1);	Not accessible directly
		System.out.println(c.str2);
		System.out.println(c.str3);
		System.out.println(c.str4);
		
		//all members are accessible indirectly
		c.display();
	}

}
