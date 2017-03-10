package com.sdet310;

public class Truck extends Vehicle {
	
	
	public Truck(String color, int noWheel, String model){
		this.setColor(color);
		this.setModel(model);
		this.setNoWheels(noWheel);
	}
	
		
	public void display(){
		System.out.println("This truck: " + this.toString() );
	}
	

}
