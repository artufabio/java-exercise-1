package com.qa.oop_exercise.garage_ex;

public class Car extends Vehicle{
	
	private int maxPassengers;
	private boolean hasRadio;

	public Car( int wheels,String colour, boolean isMotorized, String model, int id, int maxPassengers, boolean hasRadio) {
		super( wheels, colour, isMotorized, model, id);
		// TODO Auto-generated constructor stub
		this.maxPassengers = maxPassengers;
		this.hasRadio = hasRadio;
	}

	public int getMaxPassengers() {
		return maxPassengers;
	}

	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}

	public boolean isHasRadio() {
		return hasRadio;
	}

	public void setHasRadio(boolean hasRadio) {
		this.hasRadio = hasRadio;
	}

	@Override
	public String toString() {
		return "Car [maxPassengers=" + maxPassengers + ", hasRadio=" + hasRadio + ", getId()=" + getId()
				+ ", getWheels()=" + getWheels() + ", getColour()=" + getColour() + ", isMotorized()=" + isMotorized()
				+ ", getModel()=" + getModel() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
}
