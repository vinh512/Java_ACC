package edu.acc.java1.geometry;

public class Circle extends Point {
	//private Point center;
	private int radius = 1;
	
	public void setRadius(int r) {
		if (r > 0) {
			radius = r;
		}
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setCenter(Point p) {
		center.move(p.x, p.y);
	}
	
	public Point getCenter() {
		return center; // major no-no, breaking encapsulation
	}
	
	public Point getCenter() {
		return new Point(center);
	}
}