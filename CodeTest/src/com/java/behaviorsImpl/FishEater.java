package com.java.behaviorsImpl;

import com.java.behaviors.IEatingBehavior;

public class FishEater implements IEatingBehavior{

	@Override
	public void eat() {
		System.out.println("I eat other fish");
		
	}

}
