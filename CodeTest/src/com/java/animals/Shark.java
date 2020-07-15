package com.java.animals;

import com.java.behaviorsImpl.FishEater;

public class Shark extends Fish{

	
	public Shark(String size, String color) {
		super(size, color);
		eatingBehavior = new FishEater();
		System.out.println(this.getClass().getSimpleName() +" Fish size : "+ size + " and  color : "+ color);
		
	}
}
