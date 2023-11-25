package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FoodTruck[] foodTrucks = new FoodTruck[5];
		int truckCount = 0;
		
		//Greeting for the user
		System.out.println("Welcome to the Food Truck App!");

		// Loop for user input
		while (truckCount < 5) {
			System.out.println("Enter the name of the food truck (type 'quit' to stop): ");
			String truckName = scanner.nextLine();

			if (truckName.equalsIgnoreCase("quit")) {
				break; // Allows for the user to quit
			}

			System.out.println("Enter the food type: ");
			String foodType = scanner.nextLine();

			System.out.println("Enter the rating (1-5): ");
			int rating = scanner.nextInt();
			scanner.nextLine(); 

			// Create a FoodTruck object and add it to the array
			foodTrucks[truckCount] = new FoodTruck(truckName, foodType, rating);
			truckCount++; //stretch goal
		}

		// Display menu and prompt for user input
		int choice;
		do {
			System.out.println("\nMenu:");
			System.out.println("1. List all food trucks");
			System.out.println("2. See average rating");
			System.out.println("3. Display highest-rated food truck");
			System.out.println("4. Quit");

			System.out.println("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();

			// Implement menu options based on user's choice
			switch (choice) {
			case 1:
				listAllFoodTrucks(foodTrucks, truckCount);
				break;
			case 2:
				displayAverageRating(foodTrucks, truckCount);
				break;
			case 3:
				displayHighestRatedTruck(foodTrucks, truckCount);
				break;
			case 4:
				System.out.println("Goodbye!");
				break;
			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 4.");
			}
		} while (choice != 4);

		scanner.close();
	}

	// Menu logic
	
	//going to print the food trucks that have been added to the array by the user
	private static void listAllFoodTrucks(FoodTruck[] foodTrucks, int truckCount) {
		System.out.println("\nList of all food trucks:");
		for (int i = 0; i < truckCount; i++) {
			System.out.println(foodTrucks[i]);
		}
	}
	
	//Allows for the calculation of the average ratings
	private static void displayAverageRating(FoodTruck[] foodTrucks, int truckCount) {
		if (truckCount == 0) {
			System.out.println("No food trucks available to calculate average rating.");
			return;
		}
		//index for the array loop
		int totalRating = 0;
		for (int i = 0; i < truckCount; i++) {
			totalRating += foodTrucks[i].getRating();
		}

		double averageRating = (double) totalRating / truckCount;
		System.out.println("\nAverage rating of food trucks: " + averageRating);
	}

	private static void displayHighestRatedTruck(FoodTruck[] foodTrucks, int truckCount) {
		if (truckCount == 0) {
			System.out.println("No food trucks available to determine highest-rated truck.");
			return;
		}

		FoodTruck highestRatedTruck = foodTrucks[0];
		for (int i = 1; i < truckCount; i++) {
			//using fields here for readability and ease
			if (foodTrucks[i].getRating() > highestRatedTruck.getRating()) {
				highestRatedTruck = foodTrucks[i];
			}
		}

		System.out.println("\nHighest-rated food truck:\n" + highestRatedTruck);
	}
}
