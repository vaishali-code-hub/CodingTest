package com.java.behaviorsImpl;

import com.java.behaviors.ISwimmingBehavior;

public class Swimmer  implements ISwimmingBehavior{

	@Override
	public void swim() {
		System.out.println("I can swim");		
	}
}
