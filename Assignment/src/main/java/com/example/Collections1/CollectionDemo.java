package com.example.Collections1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("Tata", "maruti", 2000, 120000);
		Car c2 = new Car("Scoda", "alto", 2020, 150000);
		Car c3 = new Car("renold", "duster", 2010, 200000);
		Car c4 = c1;
		Car c5 = new Car("Nexa", "duster", 2015, 250000);
		
		Set<Car> cars = new HashSet<>();
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
		cars.add(c4);
		cars.add(c5);
		
		CellPhone cell1 = new CellPhone("nokia","120","keypad","mediatek",1200);
		CellPhone cell2 = new CellPhone("samsung","galaxy","android","qualcom",20000);
		CellPhone cell3 = new CellPhone("Iphone","11","android","ios",90000);
		
		Set<CellPhone> cellPhones = new HashSet<>();
		cellPhones.add(cell1);
		cellPhones.add(cell2);
		cellPhones.add(cell3);
		
		
		School s1=new School("Ryan","Indore","Indore",4);
		School s2=new School("Golden","Indore","Dewas",3);
		School s3=new School("Sarafa","Rau","Indore",7);
		Set<School> schools = new HashSet<>(); 
		schools.add(s1);
		schools.add(s2);
		schools.add(s3);
		
		Set<Laptop> laptops=new HashSet<Laptop>();  //Laptop set
		Laptop l1=new Laptop("HP","pavallian","Windows","Core i3");
		Laptop l2=new Laptop("Dell","x002","Linux","Core i5");
		Laptop l3=new Laptop("Mac","notebook","ios","Core i7");
		laptops.add(l1);
		laptops.add(l2);
		laptops.add(l3);
		
		Television tv1=new Television("Sony","LED",true,20000); 
		Television tv2=new Television("MI","LCD",false,15000);
		Television tv3=new Television("LG","OLED",true,50000);
		Set<Television> televisions=new HashSet<Television>();  
		televisions.add(tv1);
		televisions.add(tv2);
		televisions.add(tv3);
		
		System.out.println("CARS :");
		for(Car it: cars) {                                //Displaying cars
			System.out.println("Manufacturer: "+it.getMake()+", Model :"+it.getModel()+", Year "+it.getYear()+", Price: "+it.getPrice());
			
		}
		System.out.println("SCHOOLS :");
		for(School i:schools) {                                //Displaying schools
			System.out.println("Name: "+i.getName()+", City: "+i.getCity()+", District: "+i.getSchooldistrict()+", Ranking: "+i.getGreatSchoolRanking());
			
		}
		System.out.println("LAPTOPS");
		for(Laptop i:laptops) {                                 //Displaying Laptop
			System.out.println("Company: "+i.getCompany()+", Mode: "+i.getModel()+", OS: "+i.getOperatingSystem()+", Processor: "+i.getProcessor());
			
		}	
		System.out.println("TELEVISION");
		for(Television i:televisions) {                            //Displaying Television
			System.out.println("Company: "+i.getCompany()+", Type: "+i.getType()+", Price "+i.getPrice()+", 3D Enabled: "+i.isEnabled3D());
			
		}
		
		List<String> schoolNameList = new ArrayList<>();
		schoolNameList.add(s1.getName());
		schoolNameList.add(s2.getName());
		schoolNameList.add(s3.getName());
			
		System.out.println("List of school name:");
		for(String it: schoolNameList) {
			System.out.println(it);
		}
		

		List<Car> carList = new ArrayList<>();
		carList.add(c1);
		carList.add(c2);
		carList.add(c3);
		carList.add(c4);
		carList.add(c5);
		
		Collections.sort(carList);
		System.out.println("Sorted list of car:");
		for(Car it: carList) {
			System.out.println(it.getMake());
		}
		
		Map<String, String> studentMap = new HashMap<String, String>();
		studentMap.put("Max", "Apple");
		studentMap.put("john", "orange");
		studentMap.put("henry", "banana");
		
		for(Map.Entry<String, String> it : studentMap.entrySet()) {
			System.out.println(it.getKey()+" : "+it.getValue());
		}
	}

}
