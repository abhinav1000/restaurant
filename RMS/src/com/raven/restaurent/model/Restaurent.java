package com.raven.restaurent.model;

public class Restaurent {
	int res_id;
	String name;
	String location;
	String emai_ID;

	public Restaurent(int res_id, String name, String location, String emai_ID) {
		this.res_id = res_id;
		this.name = name;
		this.location = location;
		this.emai_ID = emai_ID;
	}

	public int getRes_id() {
		return res_id;
	}

	public void setRes_id(int res_id) {
		this.res_id = res_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmai_ID() {
		return emai_ID;
	}

	public void setEmai_ID(String emai_ID) {
		this.emai_ID = emai_ID;
	}
}
