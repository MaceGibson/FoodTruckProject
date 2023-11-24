package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {
	
	private FoodTruck [] fleet = new FoodTruck[5];
	
	public static void main(String[] args) {
	//has a main
		//create an instance of the non-static.
		FoodTruckApp app = new FoodTruckApp();
		app.run();
	}
	
	public void run() {
		//where rest of the code goes
		Scanner kb = new Scanner(System.in);
		//get the food truck info via user prompt and input
		System.out.println("Food Truck Name: ");
		String name = kb.nextLine();
		
		System.out.println("Food Truck Food: ");
		String food = kb.nextLine();
		
		System.out.println("Food Truck Numerical Rating (1-5, with 5 being the best): ");
		int rating = kb.nextInt();
		
		FoodTruck [] name = name.setName();
	}
}
