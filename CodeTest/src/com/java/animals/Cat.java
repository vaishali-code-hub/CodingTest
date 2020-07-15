package com.java.animals;

import com.java.behaviorsImpl.FlyWithoutWings;
import com.java.behaviorsImpl.NonSinger;
import com.java.behaviorsImpl.NonSwimmer;
import com.java.behaviorsImpl.Walker;

public class Cat extends Animal{
	
	public Cat() {
		flyingBehavior = new FlyWithoutWings();
		singBehavior = new NonSinger();
		swimmingBehavior = new NonSwimmer();
		walkingBehavior = new Walker();
		setCanWalk(true);
	}
	
	public void makeSound() {
		System.out.println("Cat says meow meow");
	}
}
