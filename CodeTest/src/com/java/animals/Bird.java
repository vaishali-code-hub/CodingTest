package com.java.animals;

import com.java.behaviorsImpl.FlywithWings;
import com.java.behaviorsImpl.NonSinger;
import com.java.behaviorsImpl.Singer;
import com.java.behaviorsImpl.Walker;

// Assumption: Birds can walk and fly. Only specific birds can sing and will have singing behavior set.

public class Bird extends Animal{

	public Bird() {
		flyingBehavior = new FlywithWings();
		walkingBehavior = new Walker();
		singBehavior = new Singer();
		
		setCanWalk(true);
		setCanFly(true);
		setCanSing(true);
	}
	@Override
	public void makeSound() {
		System.out.println("I can make sound");
		
	}
}

