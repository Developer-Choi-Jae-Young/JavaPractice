package com.kh.practice.list.library.model.vo;

public class Book implements Comparable<Book>{
	private String title;
	private String author;
	private String category;
	private int price;

	public Book(String title, String author, String category, int price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}

	public Book() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "\t(" + title + "/" + author + "/" + category + "/" + price + ")";
	}

	public int hashCode() {
		return this.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		return (this == obj);
	}

	public int compareTo(Book o) {
		return title.compareTo((o).getTitle());
	}
}