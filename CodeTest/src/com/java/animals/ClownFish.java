package com.java.animals;

import com.java.behaviorsImpl.NonFishEater;

public class ClownFish extends Fish{

	
	public ClownFish(String size, String color) {
		super(size, color);
		eatingBehavior = new NonFishEater();
		System.out.println(this.getClass().getSimpleName() +" Fish size : "+ size + " and  color : "+ color);
	}

}
