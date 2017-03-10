package com.sdet310;

public class Bus extends Vehicle {

	public Bus(String color, int noWheel, String model){
		this.setColor(color);
		this.setModel(model);
		this.setNoWheels(noWheel);
	}
	
	public void display(){
		System.out.println("This bus: " + this.toString() );
	}
	

}
