package com.raven.restaurent.model;

public class Customer {
	int customer_ID;
	String fname;
	String lname;
	int phone_number;

	public Customer(int customer_ID, String fname, String lname, int phone_number) {
		this.customer_ID = customer_ID;
		this.fname = fname;
		this.lname = lname;
		this.phone_number = phone_number;
	}

	public int getCustomer_ID() {
		return customer_ID;
	}

	public void setCustomer_ID(int customer_ID) {
		this.customer_ID = customer_ID;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
}
