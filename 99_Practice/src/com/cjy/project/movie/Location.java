package com.cjy.project.movie;

public class Location {
	private int id;
	private Movie movie;
	private int seatCount;
			
	public Location(int id, Movie movie, int seatCount) {
		this.id = id;
		this.movie = movie;
		this.seatCount = seatCount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
}
