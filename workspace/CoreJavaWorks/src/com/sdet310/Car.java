package com.sdet310;

public class Car extends Vehicle {

	public Car(String color, int noWheel, String model){
		this.setColor(color);
		this.setModel(model);
		this.setNoWheels(noWheel);
	}
	
	public void display(){
		System.out.println("This car: " + this.toString() );
	}
	

}
