package com.java.animals;

import com.java.behaviorsImpl.FlywithWings;
import com.java.behaviorsImpl.NonSinger;
import com.java.behaviorsImpl.Swimmer;
import com.java.behaviorsImpl.Walker;

public class Duck extends Bird{
	
	public Duck() {
		
		singBehavior =new NonSinger();
		flyingBehavior = new FlywithWings();
		swimmingBehavior = new Swimmer();
		walkingBehavior = new Walker();
		setCanSwim(true);
		setCanFly(true);
		setCanWalk(true);
	}
	 public void makeSound() {
		 System.out.println(" Says Quack Quack");
	 }

}
