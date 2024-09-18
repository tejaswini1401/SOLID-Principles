//Liskow Substitution Principle : Extends the capability of parent class do not narrow it
package com.LSP;

interface Bike{
	public void turnOnEngine();
	public void accelerate();
}
public class MotorCycle implements Bike{
	
	boolean isEngineOn;
	int speed;
	
	@Override
	public void turnOnEngine(){
		isEngineOn = true;
	}
	
	@Override
	public void accelerate() {
		speed = speed +20;
	}	
}

/*
class Bicycle implements Bike{
	
	boolean isEngineOn;
	int speed;
	
	@Override
	public void turnOnEngine(){
		throw new AssertionError("THere is no engine");
	}
	
	@Override
	public void accelerate() {
		speed = speed +10;
	}	
}
*/

class Scooter implements Bike{
	
	boolean isEngineOn;
	int speed;
	
	@Override
	public void turnOnEngine(){
		isEngineOn = true;
	}
	
	@Override
	public void accelerate() {
		speed = speed +10;
	}	
}
