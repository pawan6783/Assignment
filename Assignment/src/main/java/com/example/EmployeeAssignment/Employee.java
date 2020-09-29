package com.example.EmployeeAssignment;

public class Employee {
	
	private int id;
	private String name;
	private int monthlyBasic;
	
	public Employee(int id, String name, int monthlyBasic) {
		this.id = id;
		this.name = name;
		this.monthlyBasic = monthlyBasic;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getMonthlyBasic() {
		return monthlyBasic;
	}
	
	public int getAnnualBasic() {
		return 12 * getMonthlyBasic();
		
	}
	
	public int getMonthlyGrossSalary() {
		return (getMonthlyBasic() + (getMonthlyBasic()/2) + 1250 + 800);
		
	}
	
	public int getAnnualGrossSalary() {
		return 12 * getMonthlyGrossSalary();
		
	}
	
	public int getMonthlyDeductions() {
		
		float pf = 6500;
		
		if((10*getMonthlyBasic()/100) < pf )
			pf = (10*getMonthlyBasic()/100);
		
		float esic = 0;
		if(getMonthlyBasic() <= 5000)
			esic = ((4.75f*getMonthlyBasic()/100));
		
		int profTax = 100;
		if(getMonthlyGrossSalary() <= 10000)
			profTax=50;
		
		int monthlyDeductions = (int)(pf + esic + profTax);
		return monthlyDeductions;
	}
	
	public int getMonthlyTakeHome() {
		return getMonthlyGrossSalary() - getMonthlyDeductions();
	
	}
	
	public int getAnnualTakeHome() {
		return 12 * getMonthlyTakeHome();
		
	}
	
	public float setPFRate(float f) {
		return f;
	}
	
	public float getPFRate() {
		return (10*getMonthlyBasic()/100);
	
	}
	

	public static void main(String[] args) {
		
		Employee emp= new Employee(1,"Max Johnson",50000);
		
		System.out.println("Id: "+emp.getId());
		System.out.println("Name: "+emp.getName());
		System.out.println("Monthly Basic: "+emp.getMonthlyBasic());
		System.out.println("Annual Basic: "+emp.getAnnualBasic());
		System.out.println("Monthly Gross Salary:"+emp.getMonthlyGrossSalary());
		System.out.println("Annual Gross Salary:"+emp.getAnnualGrossSalary());
		System.out.println("Monthly Deductions: "+emp.getMonthlyDeductions());
		System.out.println("Monthly Takehome: "+emp.getMonthlyTakeHome());
		System.out.println("Annual Takehome: "+emp.getAnnualTakeHome());
	}

}
