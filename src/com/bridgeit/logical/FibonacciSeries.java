package com.bridgeit.logical;

import java.util.Scanner;

public class FibonacciSeries {
	
	
	public void generateFibSeries() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no till you want to generate a fibonacci series:");
		int generateTill=sc.nextInt();
		sc.close();
		int number1 = 0;
		int number2 = 1 ;
		
		for (int i = 0; i <generateTill; i++) {
			
			System.out.println(number1);
			int number3=number2+number1;
			number1=number2;
			number2=number3;
			
		}
	}
	

	public static void main(String[] args) {
		FibonacciSeries series = new FibonacciSeries();
		series.generateFibSeries();
	}

}