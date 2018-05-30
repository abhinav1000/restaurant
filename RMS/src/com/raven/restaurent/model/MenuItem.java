package com.raven.restaurent.model;
//Menu Item Class
class MenuItem {
	String menu_item;
	String name;
	String dsc;
	int price;

	public MenuItem(String menu_item, String name, String dsc, int price) {
		this.menu_item = menu_item;
		this.name = name;
		this.dsc = dsc;
		this.price = price;
	}

	public String getMenu_item() {
		return menu_item;
	}

	public void setMenu_item(String menu_item) {
		this.menu_item = menu_item;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDsc() {
		return dsc;
	}

	public void setDsc(String dsc) {
		this.dsc = dsc;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
