package com.java.behaviorsImpl;

import com.java.behaviors.ISingingBehavior;

public class NonSinger implements ISingingBehavior{

	@Override
	public void sing() {
		System.out.println("I cannot sing");
		
	}

}
