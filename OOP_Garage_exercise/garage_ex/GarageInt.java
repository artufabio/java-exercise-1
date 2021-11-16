package com.qa.oop_exercise.garage_ex;

import java.util.ArrayList;

public interface GarageInt {
	
	public Vehicle findVehicle(int idVehicle);
	
	public String calcBill();
	
	public ArrayList<Vehicle> addVehicle(Vehicle v);
	
	public ArrayList<Vehicle> removeVehicle(int idVehicle);
	
	public String fixVehicle(Vehicle v);
	
	public ArrayList<Vehicle> emptyGarage();
	
	public ArrayList<Vehicle> removeByType(String vehicleType);

}
