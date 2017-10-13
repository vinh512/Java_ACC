/*
	Write a Java program to calculate the distance between two points on the Cartesian plane. The formula for the distance between points is easily found online: square the difference in their x-coordinates, square the difference in their y-coordinates, sum the results and take the square root. Use (2, -1) and (-2, 2) as givens.
*/
package edu.acc.java1.geometry;

public class Geometry {
	public static void main(String[] args) {
		// gather input
		int x1 = 2,  y1 = -1;
		int x2 = -2, y2 = 2;
		
		// transform it
		double addend1 = Math.pow(x1 - x2, 2);
		double addend2 = Math.pow(y1 - y2, 2);
		double sum = addend1 + addend2;
		double distance = Math.sqrt(sum);
		
		// display result
		System.out.printf("for points at (%d, %d) and (%d, %d)\n", x1, y1, x2, y2);
		System.out.printf("The distance between is %f\n", distance);
	}
}

