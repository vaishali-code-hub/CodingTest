package com.java.tests;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import com.java.animals.Animal;
import com.java.animals.Bird;
import com.java.animals.Chicken;
import com.java.animals.Dog;
import com.java.animals.Dolphin;
import com.java.animals.Duck;
import com.java.animals.Fish;
import com.java.animals.Parrot;
import com.java.animals.Rooster;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SolutionTest extends TestCase {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

// assigning the values
	protected void setUp() {
		System.setOut(new PrintStream(outContent));
	}

	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public SolutionTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static TestSuite suite() {
		return new TestSuite(SolutionTest.class);
	}

	public void testApp() {
		questionOne();
		questionTwo();
		questionThree();
		questionFour();
		questionFive();
		questionSeven();

	}

	public void questionOne() {
		// Question1 testing
		assertTrue(true);
		Animal bird = new Bird();
		bird.performWalk();
		bird.performFly();
		bird.performSong();

		assertEquals("Icanwalk\n" + "Icanfly\n" + "Icansing", outContent.toString().trim().replace(" ", ""));

		outContent.reset();
	}

	public void questionTwo() {
		// Question2 testing
		assertTrue(true);
		Animal duck = new Duck();
		duck.makeSound();
		duck.performSwim();
		Animal chicken = new Chicken();
		chicken.makeSound();
		chicken.performFly();

		assertEquals("SaysQuackQuack\n" + "Icanswim\n" + "cluckcluck\n" + "Icannotfly",
				outContent.toString().trim().replace(" ", ""));

		outContent.reset();
	}

	public void questionThree() {
		// Question3 testing
		assertTrue(true);
		Animal rooster = new Rooster();
		rooster.makeSound();

		assertEquals("Cock-a-doodle-doo", outContent.toString().trim().replace(" ", ""));

		outContent.reset();
	}

	public void questionFour() {
		// Question4 testing
		assertTrue(true);
		Animal parrotwithdog = new Parrot(new Dog());
		parrotwithdog.makeSound();

		assertEquals("Dogsayswoofwoof", outContent.toString().trim().replace(" ", ""));
		outContent.reset();
	}

	public void questionFive() {
		// Question5 testing
		assertTrue(true);
		Animal fish = new Fish();
		fish.performSwim();
		fish.performSong();
		fish.performWalk();

		assertEquals("Icanswim\n" + "Icannotsing\n" + "Icannotwalk", outContent.toString().trim().replace(" ", ""));
		outContent.reset();
	}

	public void questionSeven() {
		// Question7 testing
		assertTrue(true);
		Animal dolphin = new Dolphin();
		dolphin.performSwim();

		assertEquals("Icanswim", outContent.toString().trim().replace(" ", ""));
		outContent.reset();
	}
}
