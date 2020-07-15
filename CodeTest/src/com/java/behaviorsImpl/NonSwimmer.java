package com.java.behaviorsImpl;

import com.java.behaviors.ISwimmingBehavior;

public class NonSwimmer  implements ISwimmingBehavior{

	@Override
	public void swim() {
		
		System.out.println("I can not swim");		
	}

	public boolean canSwim(){
		return false;
	}
}
