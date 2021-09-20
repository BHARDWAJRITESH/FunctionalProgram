package com.Bridgelabs;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("**Compute distance from  origin**");
		System.out.println("Enter coordinates of X and Y");
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		double distance = Math.sqrt(Math.pow(x,  2) + Math.pow(y, 2));
		 
		System.out.println("Distance from (0,0) to (" +x+"," +y+") is" + distance);
		
	}

}
