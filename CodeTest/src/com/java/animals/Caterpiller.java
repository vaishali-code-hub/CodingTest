package com.java.animals;

import com.java.behaviorsImpl.FlyWithoutWings;
import com.java.behaviorsImpl.Walker;

public class Caterpiller extends ButterFly {

	public Caterpiller() {
		walkingBehavior = new Walker();
		flyingBehavior = new FlyWithoutWings();
		setCanWalk(true);
		setCanFly(false);
	}
}
