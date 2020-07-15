package com.java.animals;

import com.java.behaviors.IEatingBehavior;
import com.java.behaviors.IFlyingBehavior;
import com.java.behaviors.ISingingBehavior;
import com.java.behaviors.ISwimmingBehavior;
import com.java.behaviors.IWalkingBehavior;

public abstract class Animal {

	private	boolean		canSing = false;
	private boolean		canSwim = false;
	private boolean		canFly = false;
	private boolean		canWalk = false;
	
	ISingingBehavior 	singBehavior;
	IFlyingBehavior  	flyingBehavior;
	ISwimmingBehavior 	swimmingBehavior;
	IWalkingBehavior	walkingBehavior;
	IEatingBehavior     eatingBehavior;

	public boolean isCanSing() {
		return canSing;
	}


	protected void setCanSing(boolean canSing) {
		this.canSing = canSing;
	}


	public boolean isCanSwim() {
		return canSwim;
	}


	protected void setCanSwim(boolean canSwim) {
		this.canSwim = canSwim;
	}


	public boolean isCanFly() {
		return canFly;
	}


	protected void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}


	public boolean isCanWalk() {
		return canWalk;
	}


	protected void setCanWalk(boolean canWalk) {
		this.canWalk = canWalk;
	}
	
	public abstract void  makeSound();
	
	
	public void setSingBehavior(ISingingBehavior sb) {
		singBehavior =  sb;
	}
	
	public void setFlyingingBehavior(IFlyingBehavior fb) {
		flyingBehavior =  fb;
	}
	
	public void setSwimmingBehavior(ISwimmingBehavior sb) {
		swimmingBehavior =  sb;
	}
	
	public void setWalkingBehavior(IWalkingBehavior wb) {
		walkingBehavior =  wb;
	}
	
	public void setEatingBehavior(IEatingBehavior eb) {
		eatingBehavior =  eb;
	}
	
	public void performEat() {
		eatingBehavior.eat();
	}
	
	public void performSong() {
		singBehavior.sing();
	}
	
	public void performFly() {
		flyingBehavior.fly();
	}
	
	public void performSwim() {
		swimmingBehavior.swim();
	}

	public void performWalk() {
		walkingBehavior.walk();
	}
	
}
