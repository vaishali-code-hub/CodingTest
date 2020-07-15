package com.java.animals;

import com.java.behaviorsImpl.FlywithWings;

//Assumption : The butterfly is not considered as bird, but is an animal.

public class ButterFly extends Animal {
	
	public ButterFly( ){
		flyingBehavior = new FlywithWings();
		setCanFly(true);	
	}

	@Override
	public void makeSound() {
		System.out.println(" cannot make sound");
		
	}

}
