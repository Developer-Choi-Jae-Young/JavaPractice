package com.cjy.project.movie;

public class Ticket {
	private int id;
	private Location location;
	private int price;
	
	public Ticket(int id, Location location, int price) {
		this.id = id;
		this.location = location;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
