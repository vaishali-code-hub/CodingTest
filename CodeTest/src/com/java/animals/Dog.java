package com.java.animals;

import com.java.behaviorsImpl.FlyWithoutWings;
import com.java.behaviorsImpl.NonSinger;
import com.java.behaviorsImpl.Swimmer;
import com.java.behaviorsImpl.Walker;

public class Dog extends Animal{
	
	public Dog() {
		flyingBehavior = new FlyWithoutWings();
		singBehavior = new NonSinger();
		swimmingBehavior = new Swimmer();
		walkingBehavior = new Walker();
		setCanSwim(true);
		setCanWalk(true);
	}
	
	public void makeSound() {
		System.out.println("Dog says woof woof");
	}
}
