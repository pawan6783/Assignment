package com.example.FileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class MyClass implements Serializable{

	private String Name;
	private int rollno;
	
	public MyClass(String name, int rollno) {
		super();
		Name = name;
		this.rollno = rollno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	
}

class MyClassDemo {

	public static void main(String[] args) {
		
	    ArrayList<MyClass> list=new ArrayList<MyClass>();

	  
		MyClass c1=new MyClass("john",1);
		MyClass c2=new MyClass("max",5);
		MyClass c3=new MyClass("harry",10);
		MyClass c4=new MyClass("mark",15);
		MyClass c5=new MyClass("rody",20);
		
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
		
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\Users\\pawan\\git\\repository\\Assignment\\demo.txt"))){
			for(MyClass it:list) {
				oos.writeObject(it);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\Users\\pawan\\git\\repository\\Assignment\\demo.txt"))){
			Object obj;
			while((obj=ois.readObject())!=null)
			{
				MyClass c=(MyClass)obj;
				System.out.println("Name: "+c.getName()+", RollNo: "+c.getRollno());
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		

	}

}

