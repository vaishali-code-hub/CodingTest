package com.java.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.java.animals.Animal;
import com.java.animals.AnimalFactory;
import com.java.animals.Bird;
import com.java.animals.ButterFly;
import com.java.animals.Cat;
import com.java.animals.Chicken;
import com.java.animals.Dog;
import com.java.animals.Dolphin;
import com.java.animals.Duck;
import com.java.animals.Fish;
import com.java.animals.Parrot;
import com.java.animals.Rooster;
import com.java.animals.Shark;

public class Solution {

	public static void main(String[] args) {

		// Question 1
		Animal bird = new Bird();
		System.out.println("**************************\n");
		System.out.println("Question1 output\n");
		System.out.println("Bird :");
		bird.performFly();
		bird.performSong();
		bird.performWalk();
		System.out.println("**************************\n");

		// Question 2
		System.out.println("Question2 output");
		Animal duck = new Duck();
		System.out.println("Duck :");
		duck.makeSound();
		duck.performSwim();

		Animal chicken = new Chicken();
		System.out.println("Chicken :");
		chicken.makeSound();
		chicken.performFly();

		System.out.println("**************************\n");

		// Question 3
		System.out.println("Question3 output ");
		Animal rooster = new Rooster();
		System.out.println("• Classic Classic mark of inheritance\n"
				+ "• Rooster will be subclass and Chicken will be superclass  ");
		rooster.makeSound();

		System.out.println("**************************\n");

		// Question 4
		System.out.println("Question4 output ");
		Animal parrotwithdog = new Parrot(new Dog());
		System.out.println("parrot with");
		parrotwithdog.makeSound();

		Animal parrotwithcat = new Parrot(new Cat());
		System.out.println("parrot with");
		parrotwithcat.makeSound();

		Animal parrotwithrooster = new Parrot(new Rooster());
		System.out.println("parrot with rooster :");
		parrotwithrooster.makeSound();
		System.out.println("**************************\n");

		// Question 5
		System.out.println("Question5 output ");
		Animal fish = new Fish();
		System.out.println("Fish");
		fish.performSwim();
		fish.performSong();
		fish.performWalk();

		System.out.println("**************************\n");

		// Question 6
		System.out.println("Question6 output ");
		Fish shark = new Shark("large", "grey");
		System.out.println("shark");
		shark.fishSizeAndcolor();
		shark.performEat();

		System.out.println("**************************\n");

		// Question 7
		System.out.println("Question7 output ");
		Animal dolphin = new Dolphin();
		System.out.println("dolphin");
		dolphin.performSwim();

		System.out.println("**************************\n");

		// Question 8
		System.out.println("Question8 output ");
		Animal butterfly = new ButterFly();
		System.out.println("butterfly");
		butterfly.performFly();
		butterfly.makeSound();

		System.out.println("**************************\n");

		// Question 9
		System.out.println("Question9 output ");

		List<String> names = new ArrayList<String>(Arrays.asList("Bird", "Butterfly", "Cat", "Caterpillar", "Chicken",
				"Clownfish", "Dog", "Dolphin", "Duck", "Fish", "Parrot", "Rooster", "Shark"));
		List<Animal> animals = new ArrayList<Animal>();
		AnimalFactory factory = new AnimalFactory();
		Animal co_habitor = null;

		int countFlyingAnimals = 0, countSwimmingAnimals = 0, countWalkingAnimals = 0, countSingingAnimals = 0;

		for (String name : names) {
			// Only for testing: Parrot with "Duck"
			if (name.equalsIgnoreCase("Parrot"))
				co_habitor = factory.getAnimal("Duck", new Duck());

			animals.add(factory.getAnimal(name, co_habitor));
		}

		// Solution to E:

		for (Animal animal : animals) {
			if (animal.isCanFly())
				countFlyingAnimals++;
			if (animal.isCanSing())
				countSingingAnimals++;
			if (animal.isCanSwim())
				countSwimmingAnimals++;
			if (animal.isCanWalk())
				countWalkingAnimals++;
		}

		System.out.println("Total number of Walking Animals: " + countWalkingAnimals);
		System.out.println("Total number of Swimming Animals: " + countSwimmingAnimals);
		System.out.println("Total number of Singing Animals: " + countSingingAnimals);
		System.out.println("Total number of Flying Animals: " + countFlyingAnimals);

	}

}
