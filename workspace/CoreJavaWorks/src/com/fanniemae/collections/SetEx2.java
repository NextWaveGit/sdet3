package com.fanniemae.collections;

import java.util.HashSet;

class Device{
	
	private int dId;
	public Device(int i, String string) {
		// TODO Auto-generated constructor stub
		
		this.dId = i;
		this.name = string;
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Device [dId=" + dId + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.name.charAt(0);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		Device temp = (Device)obj;
		
		return this.dId == temp.dId && this.name == temp.name;
	}
	
	
	
	
}

public class SetEx2 {
	
	public static void main(String args[]){
		
		HashSet<Device> devices = new HashSet<Device>();
		
		
		devices.add(new Device(101,"Laptop"));
		
		devices.add(new Device(102,"Computer"));
		
		devices.add(new Device(101,"Laptop"));
		
		for(Device temp : devices){
			System.out.println(temp);
		}
		
		
		
		
	}

}
