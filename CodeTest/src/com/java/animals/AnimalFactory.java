package com.java.animals;

public class AnimalFactory {
	//Assumption: co_habitor will be created and passed to getAnimal. It is required for the Parrot.
	public Animal getAnimal(String type, Animal co_habitor) {
		if (type == null)
			return null;
		else if (type.equalsIgnoreCase("BIRD"))
			return new Bird();
		else if (type.equalsIgnoreCase("DOG"))
			return new Dog();
		else if (type.equalsIgnoreCase("CAT"))
			return new Cat();
		else if (type.equalsIgnoreCase("ROOSTER"))
			return new Rooster();
		else if (type.equalsIgnoreCase("CATERPILLAR"))
			return new Caterpiller();
		else if (type.equalsIgnoreCase("CHICKEN"))
			return new Chicken();
		else if (type.equalsIgnoreCase("BUTTERFLY"))
			return new ButterFly();
		else if (type.equalsIgnoreCase("CLOWNFISH"))
			return new ClownFish("Small", "Orange");
		else if (type.equalsIgnoreCase("DOLPHIN"))
			return new Dolphin();
		else if (type.equalsIgnoreCase("DUCK"))
			return new Duck();
		else if (type.equalsIgnoreCase("DOLPHIN"))
			return new Dolphin();
		else if (type.equalsIgnoreCase("FISH"))
			return new Fish("Medium", "Gray");
		else if (type.equalsIgnoreCase("PARROT"))
			return new Parrot(co_habitor);
		else if (type.equalsIgnoreCase("SHARK"))
			return new Shark("LARGE", "GREY");
		else
			return null;
	}
}
