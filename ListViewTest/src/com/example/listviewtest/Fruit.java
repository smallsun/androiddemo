package com.example.listviewtest;

public class Fruit {

	private String name;
	private int imageId;
	public String getName() {
		return name;
	}
	public Fruit(String name, int imageId) {
		super();
		this.name = name;
		this.imageId = imageId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getImageId() {
		return imageId;
	}
	public void setImageId(int imageId) {
		this.imageId = imageId;
	}
}
