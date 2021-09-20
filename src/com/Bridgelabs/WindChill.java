package com.Bridgelabs;

import java.util.Scanner;

public class WindChill {
		public static void main(String args[]) {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("====== Wind Chill Computation ======");
			System.out.println("Enter Temperature in Fahrenheit: ");
			
			double temperature = scan.nextDouble();
			System.out.println("Enter Wind Speed in mph: ");
			
			double velocity = scan.nextDouble();
			double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(velocity, 0.16);
			
			System.out.println("Given temperature of " + temperature + " Fahrenheit" + " and a wind speed of " + velocity + " mph");
			System.out.printf("The windchill is = .4f " , windChill);
		}

}
