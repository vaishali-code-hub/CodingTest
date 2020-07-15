package com.java.animals;

public class Parrot extends Bird {

	private Animal flat_mate;

	public Parrot(Animal co_habitor) {
		setCanFly(true);
		setCanWalk(true);
		flat_mate = co_habitor;
	}

	@Override
	public void makeSound() {
		if (flat_mate != null)
			flat_mate.makeSound();
		else
			System.out.println("Parrot doesn't live with any other animal/device");
	}

}
