package com.qa.main;

import java.util.Scanner;

public class Exceptions {

	public Double divide() {

		Scanner input = new Scanner(System.in);
		Integer num1 = null;
		Integer num2 = null;
		try {
			do {
				try {
					System.out.println("Enter first integer: ");
					num1 = Integer.parseInt(input.nextLine());
				} catch (NumberFormatException nfe) {
					System.out.println("That was not an integer.");
				}
			} while (num1 == null);

			do {
				try {
					System.out.println("Enter second integer: ");
					num2 = Integer.parseInt(input.nextLine());
				} catch (NumberFormatException nfe) {
					System.out.println("That was not an integer.");
				}
			} while (num2 == null);

		} finally {
			input.close();
		}
		try {
			double divisionProduct = num1 / num2;
			return divisionProduct;
		} catch (ArithmeticException ae) {
			System.out.println("You attempted dividing by zero.");
			return null;
		}

	}
}
