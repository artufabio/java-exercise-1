package com.qa.oop_exercise.garage_ex;

/*
 * 1. Using Vehicle as a base class, create three derived classes (Car, Motorbike, etc.). 
 * Each derived class should have its own attributes in addition to the normal Vehicle attributes.

2. Using a List<> implementation, store all your Vehicles in a Garage class.

3. Create a method in Garage that iterates through each Vehicle, 
calculating a bill for each type of Vehicle in a different way, 
depending on the type of Vehicle it is (this does not need to be complex).

4. Garage should have methods that add a Vehicle, remove a Vehicle by its ID or its type,
 fix a Vehicle (which calculates the bill) and to empty the Garage.

5. Garage should have a method to remove multiple Vehicles by their type.*/

public class Vehicle {

	private int id;
	private int wheels;
	private String colour;
	private boolean isMotorized;
	private String model;
	
	
	public Vehicle() {
		super();
	}

	public Vehicle(int wheels, String colour, boolean isMotorized, String model, int id) {
		super();
		this.id = id;
		this.wheels = wheels;
		this.colour = colour;
		this.isMotorized = isMotorized;
		this.model = model;
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getWheels() {
		return wheels;
	}


	public void setWheels(int wheels) {
		this.wheels = wheels;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public boolean isMotorized() {
		return isMotorized;
	}


	public void setMotorized(boolean isMotorized) {
		this.isMotorized = isMotorized;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", wheels=" + wheels + ", colour=" + colour + ", isMotorized=" + isMotorized
				+ ", model=" + model + "]";
	}
	
	public String getVehicleType(Vehicle v) {
		return v.getClass().getSimpleName();
	}
	
	public int getBill(Vehicle v) {
		// TODO Auto-generated method stub
		String vehicleType = v.getVehicleType(v);
		switch (vehicleType) {
		case "Car":
			return 1000;
		case "Motorbike":
			return 400;
		case "Bycicle":
			return 20;
		default:
			return 0;
		}
	}
	
	
}
