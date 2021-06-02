package com.registration.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private long mobile_no;
	private int pincode;
	private String password;
	private String address;
	private Date registration_date;

	public User() {
	}

	public User(int pincode, String password, int mobile_no, String address, Date registration_date) {
		super();
		this.pincode = pincode;
		this.password = password;
		this.mobile_no = mobile_no;
		this.address = address;
		this.registration_date = registration_date;
	}

	@Override
	public String toString() {
		return "User [pincode=" + pincode + ", password=" + password + ", mobile_no=" + mobile_no + ", address="
				+ address + ", registration_date=" + registration_date + "]";
	}

	public long getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getRegistration_date() {
		return registration_date;
	}

	public void setRegistration_date(Date registration_date) {
		this.registration_date = registration_date;
	}

}
