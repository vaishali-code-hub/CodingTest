package com.java.animals;

import com.java.behaviorsImpl.FlyWithoutWings;
import com.java.behaviorsImpl.NonSinger;
import com.java.behaviorsImpl.NonSwimmer;
import com.java.behaviorsImpl.Walker;

public class Chicken extends Bird{

	public Chicken() {
		singBehavior =new NonSinger();
		//Assumption: Chicken can not swim.
		swimmingBehavior = new NonSwimmer();
		flyingBehavior = new FlyWithoutWings();
		walkingBehavior = new Walker();
		setCanWalk(true);
		setCanFly(false);
	}

	@Override
	public void makeSound() {
		System.out.println("cluck cluck");	
	}

}
