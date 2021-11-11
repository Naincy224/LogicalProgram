package com.bridgeit.logical;

import java.util.Scanner;

public class PerfectNumber {

	public void generatePerfectNo() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check if it is perfect or not:");
		int number = sc.nextInt();
		sc.close();
		int sum = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}

		if (sum == number) {
			System.out.println(number + " is a perfect number");
		} else {
			System.out.println(number + " is not a perfect number");
		}

	}
	
	
	public static void main(String[] args) {
		PerfectNumber perfectObj= new PerfectNumber();
		perfectObj.generatePerfectNo();
	}

}