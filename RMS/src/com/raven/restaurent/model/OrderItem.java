package com.raven.restaurent.model;

public class OrderItem {
	int order_id;
	String order_name;
	String menu_items;
	String qty;

	public OrderItem(int order_id, String order_name, String menu_items, String qty) {
		this.order_id = order_id;
		this.order_name = order_name;
		this.menu_items = menu_items;
		this.qty = qty;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public String getOrder_name() {
		return order_name;
	}

	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}

	public String getMenu_items() {
		return menu_items;
	}

	public void setMenu_items(String menu_items) {
		this.menu_items = menu_items;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}
}
