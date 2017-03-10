package com.client;

import com.fanniemae.*;

public class FigureClient {
	
	public static void display(Figure[] figs){
		for(Figure temp : figs){
			temp.area();
			temp.draw();
		}
	}
	public static void main (String[] args){
		
		Figure[] figs = new Figure[2];
		figs[0] = new Circle(100);
		figs[1] = new Circle(50);
		display(figs);
	}

}
