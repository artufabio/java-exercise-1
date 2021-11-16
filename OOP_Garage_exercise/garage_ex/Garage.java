package com.qa.oop_exercise.garage_ex;

import java.util.ArrayList;

public class Garage implements GarageInt{
	
	ArrayList<Vehicle> myGarage = new ArrayList<>();
	
	
	@Override
	public Vehicle findVehicle(int idVehicle) {
		// TODO Auto-generated method stub
		for (Vehicle vehicle : myGarage) {
			if (vehicle.getId() == idVehicle) {
				return vehicle;
			}
		}
		return new Vehicle();
	}
	
	
//	3. Create a method in Garage that iterates through each Vehicle, 
//	calculating a bill for each type of Vehicle in a different way, 
//	depending on the type of Vehicle it is (this does not need to be complex).

	@Override
	public String calcBill() {
		String billView = "";
		if (myGarage.isEmpty()) {
			return "There are no vehicles inside my garage.";
		} else {
			for (Vehicle v : myGarage) {
				billView += v.getModel() + ", id " + v.getId() + ": bill to pay -> " + v.getBill(v) + "\n";
			}
		}
		return billView;
	}
	
	
//	4. Garage should have methods that add a Vehicle, remove a Vehicle by its ID or its type,
//	 fix a Vehicle (which calculates the bill) and to empty the Garage.

	@Override
	public ArrayList<Vehicle> addVehicle(Vehicle v) {
		// TODO Auto-generated method stub
		myGarage.add(v);
		return myGarage;
	}

	@Override
	public ArrayList<Vehicle> removeVehicle(int idVehicle) {
		// TODO Auto-generated method stub
		for (Vehicle v : myGarage) {
			if (v.getId() == idVehicle) {
				myGarage.remove(v);
			}
		}
		return myGarage;
	}

	@Override
	public String fixVehicle(Vehicle v) {
		// TODO Auto-generated method stub
		return v.getModel() + ", id " + v.getId() + " is fixed: bill to pay -> " + v.getBill(v)*2;
	}

	@Override
	public ArrayList<Vehicle> emptyGarage() {
		// TODO Auto-generated method stub
		myGarage.clear();
		return myGarage;
	}
	
//	5. Garage should have a method to remove multiple Vehicles by their type.

	@Override
	public ArrayList<Vehicle> removeByType(String vehicleType) {
		// TODO Auto-generated method stub
		for (Vehicle v : myGarage) {
			if (vehicleType.equals(v.getVehicleType(v))) {
				myGarage.remove(v);
			}
		}
		return myGarage;
	}

}
