package com.example.Collections1;

public class School {
	private String name;
	private String city;
	private String schooldistrict;
	private int greatSchoolRanking;	
		
	public School(String name, String city, String schooldistrict, int greatSchoolRanking) {
		this.city=city;
		this.name=name;
		this.schooldistrict=schooldistrict;
		this.greatSchoolRanking=greatSchoolRanking;
	}
	
	public boolean equals(Object o) {
		if(o!=null&&this!=null) {
			if(this.name==((School)o).name&& this.city==((School)o).city && this.schooldistrict==((School)o).schooldistrict)
			return true;
		}
		return false;	
	}
	
	
	 public int hashCode(){

	        return name.hashCode() ^ city.hashCode();
	    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSchooldistrict() {
		return schooldistrict;
	}

	public void setSchooldistrict(String schooldistrict) {
		this.schooldistrict = schooldistrict;
	}

	public int getGreatSchoolRanking() {
		return greatSchoolRanking;
	}

	public void setGreatSchoolRanking(int greatSchoolRanking) {
		this.greatSchoolRanking = greatSchoolRanking;
	}
}
