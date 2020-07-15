package com.java.animals;


import com.java.behaviorsImpl.NonSinger;
import com.java.behaviorsImpl.NonWalker;
import com.java.behaviorsImpl.Swimmer;

public class Fish  extends Animal{

	String size;
	String color;
	public Fish() {
		walkingBehavior = new  NonWalker();
		singBehavior = new NonSinger();
		swimmingBehavior = new Swimmer();
	}
	public Fish(String size , String color) {
		
		this.size = size;
		this.color = color;
		setCanSwim(true);
	}


	@Override
	public void makeSound() {
		System.out.println("Fish cannot make sounds");
		
	} 
	
	public void fishSizeAndcolor() {
		System.out.println("Fish size"+ size + " and " + color);
		
	} 
	
	
	
	
}
