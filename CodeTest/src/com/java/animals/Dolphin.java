package com.java.animals;


import com.java.behaviorsImpl.Swimmer;

public class Dolphin extends Animal {
	
	public Dolphin(){
		swimmingBehavior = new Swimmer();
		setCanSwim(true);
	}
	

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Doplhins can not make sound");
	}
}
