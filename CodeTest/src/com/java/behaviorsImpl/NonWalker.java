package com.java.behaviorsImpl;

import com.java.behaviors.IWalkingBehavior;

public class NonWalker implements IWalkingBehavior{
	public void walk() {
		System.out.println("I can not walk");
	}
}