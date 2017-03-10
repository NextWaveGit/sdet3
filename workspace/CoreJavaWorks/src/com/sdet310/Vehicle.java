package com.sdet310;

public abstract class Vehicle {
	private String color = "Red";
	private int noWheels = 4;
	private String model = "Unkown";
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNoWheels() {
		return noWheels;
	}
	public void setNoWheels(int noWheels) {
		this.noWheels = noWheels;
	}
	
	
    @Override
	public String toString() {
		return "Vehicle [color=" + color + ", noWheels=" + noWheels + ", model=" + model + "]";
	}
    
	public abstract void display();
}
