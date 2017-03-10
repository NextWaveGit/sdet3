package com.sdet310;

public class Road {
	
	
	public static void main(String[] args){
		Vehicle v1 = new Truck("Blue", 8, "Monster");
		Vehicle v2 = new Bus("Yellow", 6, "School");
		Vehicle v3 = new Car("Red", 4, "Tesla");
		
		v1.display();
		v2.display();
		v3.display();
	}

	
	

}
