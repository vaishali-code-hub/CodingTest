package com.java.behaviorsImpl;

import com.java.behaviors.ISingingBehavior;

public class Singer implements ISingingBehavior{

	@Override
	public void sing() {
		System.out.println("I can sing");
		
	}

}
