package com.java.behaviorsImpl;

import com.java.behaviors.IEatingBehavior;

public class NonFishEater implements IEatingBehavior{

	@Override
	public void eat() {
		System.out.println("I can not eat other fish");
		
	}
}
