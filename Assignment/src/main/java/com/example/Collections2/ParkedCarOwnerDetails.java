package com.example.Collections2;

public class ParkedCarOwnerDetails {
	private String owerName;
	private String carModel;
	private String carNO;
	private String owerMobileNo;
	private String owerAddress;
	
	public ParkedCarOwnerDetails(String owerName, String carModel, String carNO, String owerMobileNo, String owerAddress) {
		super();
		this.owerName = owerName;
		this.carModel = carModel;
		this.carNO = carNO;
		this.owerMobileNo = owerMobileNo;
		this.owerAddress = owerAddress;
	}

	public int getToken() {
		return 100+(int)Math.random()*1000;
	}
	
	public String getOwerName() {
		return owerName;
	}
	public void setOwerName(String owerName) {
		this.owerName = owerName;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getCarNO() {
		return carNO;
	}
	public void setCarNO(String carNO) {
		this.carNO = carNO;
	}
	public String getOwerMobileNo() {
		return owerMobileNo;
	}
	public void setOwerMobileNo(String owerMobileNo) {
		this.owerMobileNo = owerMobileNo;
	}
	public String getOwerAddress() {
		return owerAddress;
	}
	public void setOwerAddress(String owerAddress) {
		this.owerAddress = owerAddress;
	}
	
}
