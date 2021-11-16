package com.qa.oop_exercise.garage_ex;

public class Motorbike extends Vehicle{
	
	

	public Motorbike(int wheels, String colour, boolean isMotorized, String model, int id) {
		super(wheels, colour, isMotorized, model, id);
		// TODO Auto-generated constructor stub
		isMotorized = true;
		wheels = 2;
	}
	
	

}
