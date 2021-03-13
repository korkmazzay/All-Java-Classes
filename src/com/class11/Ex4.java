package com.class11;

public class Ex4 {

	public static void main(String[] args) {

		String[][] cars = { { "chevy", "ford", "tesla" }, { "Mercedez", "Volkswagen", "Audi" }, { "Hyundai", "Kia" },
				{ "Fiat", "Alfa Romeo", "Maserati", "Ferrari" } };
		for (int row = 0; row < cars.length; row++) {
			for (int col = 0; col < cars[row].length; col++) {
				System.out.println(cars[row][col] + " ");
			}
			System.out.println("-------------------");
		}
		System.out.println("============   Nested For Each Loop  =============");
		for (String[] car : cars) {
			for (String c : car) {
				System.out.println(c);
			}
			System.out.println("-------------------");
		}
		
		///Using 2D array create a grocery list.
		//Inside you should have an array of veggies, fruits, dairy and sweets.
		//Retrieve all values from that array using 2 different loops
		System.out.println("==================== Task 2 ===========================");
		
		String[][] fruits = { { "Tomato", "Celery", "Onions" }, { "Apple", "Melon", "Orange" }, { "Milk", "Cheese" },
				{ "Chocolate", "Paneer", "Jelly", "Creampie" } };
		for (int row = 0; row < fruits.length; row++) {
			for (int col = 0; col < fruits[row].length; col++) {
				System.out.println(fruits[row][col] + " ");
			}
			System.out.println("-------------------");
		}
		System.out.println("============   Nested For Each Loop  =============");
		for (String[] frt : fruits) {
			for (String f : frt) {
				System.out.println(f);
			}
			System.out.println("-------------------");
	}
		
	
		
	}

}
