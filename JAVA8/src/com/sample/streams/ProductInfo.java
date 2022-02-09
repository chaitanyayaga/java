package com.sample.streams;

public class ProductInfo  {
	
	private String name;
	private String upc;
	private double price;
	private int quantity;
	public ProductInfo(String name, String upc, double price, int quantity) {
		super();
		this.name = name;
		this.upc = upc;
		this.price = price;
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUpc() {
		return upc;
	}
	public void setUpc(String upc) {
		this.upc = upc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

}
