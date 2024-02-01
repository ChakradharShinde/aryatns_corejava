package com.arya.aggregation.address;

public class Address {
	private String city;
	private int pincode;
	private String landMark;
	private boolean currecntAddress;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String city, int pincode, String landMark, boolean currecntAddress) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.landMark = landMark;
		this.currecntAddress = currecntAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public boolean isCurrecntAddress() {
		return currecntAddress;
	}
	public void setCurrecntAddress(boolean currecntAddress) {
		this.currecntAddress = currecntAddress;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + ", landMark=" + landMark + ", currecntAddress="
				+ currecntAddress + "]";
	}
}
