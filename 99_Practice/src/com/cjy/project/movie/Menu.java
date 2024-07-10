package com.cjy.project.movie;

public class Menu {
	private String name;
	private int price;
	private int amount;
	private String category;
	
	public Menu(String name, int price, int amount, String category) {
		this.name = name;
		this.price = price;
		this.amount = amount;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}
