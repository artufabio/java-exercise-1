package com.qa.oop_exercise.garage_ex;

public class Bycicle extends Vehicle{
	
	private int gear;
	private int cadence;

	public Bycicle(int wheels, String colour, boolean isMotorized, String model, int id, int gear, int cadence) {
		super(wheels, colour, isMotorized, model, id);
		this.gear = gear;
		this.cadence = cadence;
		isMotorized = true;
		wheels = 2;
		// TODO Auto-generated constructor stub
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getCadence() {
		return cadence;
	}

	public void setCadence(int cadence) {
		this.cadence = cadence;
	}

	@Override
	public String toString() {
		return "Bycicle [gear=" + gear + ", cadence=" + cadence + ", getId()=" + getId() + ", getWheels()="
				+ getWheels() + ", getColour()=" + getColour() + ", isMotorized()=" + isMotorized() + ", getModel()="
				+ getModel() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	

}
