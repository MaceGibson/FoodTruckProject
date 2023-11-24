package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
//no main

	// private fields for the FoodTruck object
	private static int nextTruckId = 1; // stretch goal
	private int truckId;// stretch goal
	private String name;
	private String foodType;
	private int rating;

	// Constructor -easier than setters for this design

	public FoodTruck(String name, String foodType, int truckRating) {
		this.nextTruckId = nextTruckId++;// stretch goal incrementing
		this.name = name;
		this.foodType = foodType;
		this.rating = truckRating;
	}

	// the following lines will be the eclipse gen setters and getters

	public int getTruckId() {
		return truckId;
	}

	public String getName() {
		return name;
	}

	public String getFoodType() {
		return foodType;
	}

	public int getRating() {
		return rating;
	}
	
	// now a toString for display purposes
	@Override  //apparently good practice and done by eclipse
		public String toString() {
		return "Truck ID: " + truckId +
                "\nName: " + name +
                "\nFood Type: " + foodType +
                "\nRating: " + rating + "\n";
		}

}
