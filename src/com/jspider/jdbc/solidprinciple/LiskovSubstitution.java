package com.jspider.jdbc.solidprinciple;

//parent class reference can be substitute by child class.it means we can't narrow the capabilities of parent class
interface Bike {
	void turnOnEngine();

	void accelerate();
}

class MotorCycle implements Bike {
	boolean isEngineOn;
	int speed;

	@Override
	public void turnOnEngine() {
		isEngineOn = true;
	}

	@Override
	public void accelerate() {
		speed = speed + 10;
	}
}

class Bicycle implements Bike {

	@Override
	public void turnOnEngine() {
		throw new AssertionError("There is no engine");
	}

	@Override
	public void accelerate() {
		// do something
	}

}

public class LiskovSubstitution {
	Bike bike = new Bicycle();//here this principle will break cooz throwing exception so add some functionality
}
