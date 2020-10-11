package com.example.Collections2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ParkedCarOwnerList {
	HashMap<Integer, ParkingLocation> ownerList = new HashMap<>();
	
	public int addNewCar(ParkedCarOwnerDetails pcod) {
		ParkingLocation pl = ParkingLocation.getParkingLocation(pcod);
		int token = pl.getToken();
		ownerList.put(token,pl);
		return token;
	}
	public void removeCar(int token) {
		boolean flag = false;
		for(int it : ownerList.keySet()) {
			if(it == token) {
				ownerList.remove(it);
				flag = true;
				break;
			}
		}
		if(flag)
			System.out.println("Car removed");
		else
			System.out.println("Invalid token");
	}
	public String getLocation(int token) {
		for(int it : ownerList.keySet()) {
			if(it == token) {
				return ownerList.get(it).getLocation();
			}
		}
		return "Invalid token";
	}
	public void showList() {
		String ownerName ;
		String carModel;
		String carNo;
		String ownerMobileNo;
		String ownerAddress;
		String location;
		int token;
		
		for(Map.Entry<Integer, ParkingLocation> it : ownerList.entrySet()) {
			ownerName = it.getValue().getPcod().getOwerName();
			carModel = it.getValue().getPcod().getCarModel();
			carNo = it.getValue().getPcod().getCarNO();
			ownerMobileNo = it.getValue().getPcod().getOwerMobileNo();
			ownerAddress = it.getValue().getPcod().getOwerAddress();
			location = it.getValue().getLocation();
			token = it.getKey();
			
			System.out.println("Token: "+token);
			System.out.println("Parking Location: "+location);
			System.out.println("Owner Details: "+ownerName+", "+carModel+", "+carNo+", "+ownerMobileNo+", "+ownerAddress);
		}
	}
}
