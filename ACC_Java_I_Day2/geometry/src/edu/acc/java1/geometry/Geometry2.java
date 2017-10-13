/*
	Write a Java program to calculate the distance between two points on the Cartesian plane. The formula for the distance between points is easily found online: square the difference in their x-coordinates, square the difference in their y-coordinates, sum the results and take the square root. Use (2, -1) and (-2, 2) as givens.
*/
package edu.acc.java1.geometry;

public class Geometry2 {
	public static void main(String[] args) {
		// gather input
		Point p = new Point(2, -1);
		Point q = new Point(-2, 2);
		
		// would create an origin point (0,0)
		Point r = new Point();
		
		//p.x = 2;
		//p.y = -1;
		//q.x = -2;
		//q.y = 2;
		
		//int x1 = 2,  y1 = -1;
		//int x2 = -2, y2 = 2;
		
		// transform it
		double addend1 = Math.pow(p.x - q.x, 2);
		double addend2 = Math.pow(p.y - q.y, 2);
		double sum = addend1 + addend2;
		double distance = Math.sqrt(sum);
		
		
		double distance = p.distanceTo(q);
		
		// System.out.printf("For points %s and %s\n", p.display(), q.display());
		System.out.printf("For points %s and %s\n", p, q);
		// display result
		// display(p, q);
		System.out.printf("The distance between is %f\n", distance);
		
		System.out.print(p);
		
		//move a point
		q.x = 3;
		q.y = -120;
		
		q.move(3, -120);
		
		Circle c = new Circle();
		
		c.radius = 7; // this is now broken because radius is set to private
		c.setRadius(7);
		
		c.center = new Point();
		// c.center = p;
		// c.center = q;
		
	}
	
	/*
	private static void display(Point a, Point b) {
		System.out.printf("For points at (%d, %d) and (%d, %d)\n", a.x, a.y, b.x, b.y)
	}
	*/
}

