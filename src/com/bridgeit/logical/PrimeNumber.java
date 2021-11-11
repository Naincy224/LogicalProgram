package com.bridgeit.logical;

import java.util.Scanner;

public class PrimeNumber {

	public void checkPrimeOrNot() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check if it is prime or not:");
		int value = sc.nextInt();
		sc.close();

		boolean trueOrFalse = false;
		for (int i = 2; i <= value / 2; ++i) {
			if (value % i == 0) {
				trueOrFalse = true;
				break;
			}
		}

		if (trueOrFalse) {
			System.out.println(value + " is not a prime number.");
		}

		else {
			System.out.println(value + " is a prime number.");
		}

	}

	public static void main(String[] args) {
		PrimeNumber primeObj = new PrimeNumber();
		primeObj.checkPrimeOrNot();
	}

}