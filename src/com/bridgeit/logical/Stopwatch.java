package com.bridgeit.logical;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Stopwatch {

	public static void main(String[] arg) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Press Enter to start");
		sc.nextLine();
		Instant start = Instant.now();
		System.out.println("Press Enter to stop");
		sc.nextLine();
		sc.close();
		Instant stop = Instant.now();
		long timeElapsed = Duration.between(start, stop).toSeconds();
		System.out.println("Time Elapsed : " + timeElapsed + " Seconds");

	}

}