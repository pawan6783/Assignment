package com.example.Collections2;

public class ParkedCarDemo {
	public static void main(String[]args) {
		ParkedCarOwnerDetails pcod1 = new ParkedCarOwnerDetails("john", "suzuki800", "101", "2546454654", "godha street");
		ParkedCarOwnerDetails pcod2 = new ParkedCarOwnerDetails("max", "duster", "506", "9787434654", "jawahar street");
		ParkedCarOwnerDetails pcod3 = new ParkedCarOwnerDetails("henry", "mg", "202", "6458434654", "vijay nagar");
		
		ParkedCarOwnerList pcol = new ParkedCarOwnerList();
		int token1 = pcol.addNewCar(pcod1);
		int token2 = pcol.addNewCar(pcod2);
		int token3 = pcol.addNewCar(pcod3);
		pcol.showList();
		
		pcol.removeCar(token1);
		pcol.showList();
		
		System.out.println(pcol.getLocation(token2));
	}

}
