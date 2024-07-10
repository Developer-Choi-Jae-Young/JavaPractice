package com.cjy.project.movie;

public class Movie {
	private String name;
	private int runningTime;
	private String distributor;
	private String imagePath;
	private String context;
	private Boolean isAdult;
	
	public Movie(String name, int runningTime, String distributor, String imagePath, String context, Boolean isAdult) {
		this.name = name;
		this.runningTime = runningTime;
		this.distributor = distributor;
		this.imagePath = imagePath;
		this.context = context;
		this.isAdult = isAdult;
	}

	public Boolean getIsAdult() {
		return isAdult;
	}

	public void setIsAdult(Boolean isAdult) {
		this.isAdult = isAdult;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}

	public String getDistributor() {
		return distributor;
	}

	public void setDistributor(String distributor) {
		this.distributor = distributor;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}
}
