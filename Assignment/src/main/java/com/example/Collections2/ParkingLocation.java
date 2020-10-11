package com.example.Collections2;

public class ParkingLocation {
	private static int floor=1;
	private static int section=1;
	private static int numberOfCars = 1;
	private ParkedCarOwnerDetails pcod;
	private String location="";
	private int token;
	
	public ParkedCarOwnerDetails getPcod() {
		return pcod;
	}

	public void setPcod(ParkedCarOwnerDetails pcod) {
		this.pcod = pcod;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setToken(int token) {
		this.token = token;
	}

	public static ParkingLocation getParkingLocation(ParkedCarOwnerDetails pcod) {
		ParkingLocation pl = new ParkingLocation();
		pl.pcod = pcod;
		pl.location = ParkingLocation.getCarLocation();
		pl.token = ParkingLocation.getToken();
		return pl;
	}
	
	public static String getCarLocation() {
		if(numberOfCars >= 20) {
			section++;
		}
		if(section > 4) {
			floor++;
		}
		if(floor > 3) {
			return "No parking space";
		}
		return "Car parked on floor= "+floor+", section= "+section;
	}
	
	public static int getToken() {
		return 100+(int)Math.random()*1000;
	}
}
