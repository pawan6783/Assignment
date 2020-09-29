package com.example.BasicInheritance1;

class First {
	
	private int id;
	private String firstMessage;
	
	public First() {
		super();
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstMessage() {
		return firstMessage;
	}

	public void setFirstMessage(String firstMessage) {
		this.firstMessage = firstMessage;
	}

}

class Second {
	
	private int id;
	private String secondMessage;
	
	public Second() {
		super();
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSecondMessage() {
		return secondMessage;
	}

	public void setSecondMessage(String firstMessage) {
		this.secondMessage = firstMessage;
	}

}


public class Two {
	
	public static void main(String[] args) {
		First f = new First();
		f.setId(100);
		f.setFirstMessage("Message in first class");
		System.out.println("First: id = "+f.getId()+" message = "+f.getFirstMessage());
		
		Second s = new Second();
		s.setId(200);
		s.setSecondMessage("Message in second class");
		System.out.println("First: id = "+s.getId()+" message = "+s.getSecondMessage());
		
	}

}
