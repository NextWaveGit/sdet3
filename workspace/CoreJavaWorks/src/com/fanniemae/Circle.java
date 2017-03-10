package com.fanniemae;

	public class Circle extends Figure{
		
		private double rad;
		
		public Circle(double rad){
			this.rad = rad;
		}
		
		public void area(){
			System.out.println(PI*rad*rad);
		}
		
	}
