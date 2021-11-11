package com.bridgeit.logical;
import java.util.Scanner;

public class ReverseNumber {

	public void generateReverseNumber() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to generate its reverse number:");
		int number = sc.nextInt();
		sc.close();
		
		int reverse = 0;
		
		while (number>0) {
			int temp = number % 10;
			reverse = (reverse*10) + temp;
			number = number/10;	
		}
		
		System.out.println("The generated reverse number is:"+reverse);
	}
	
	public static void main(String[] args) {
		
		ReverseNumber reverseObj= new ReverseNumber();
		reverseObj.generateReverseNumber();
	}

}