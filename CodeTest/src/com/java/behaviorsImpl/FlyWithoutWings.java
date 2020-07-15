package com.java.behaviorsImpl;

import com.java.behaviors.IFlyingBehavior;

public class FlyWithoutWings  implements IFlyingBehavior {
	@Override
	public void fly() {
	System.out.println("I can not fly");
		
	}

}
