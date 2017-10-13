package edu.acc.java1.geometry;

public class Point {
	public int x;
	public int y;
	
	public Point() {}
	
	public Point(Point p) {
		move(p.x, p.y);
		// x = p.x;
		// y = p.y;
	}
	
	public Point(int a, int b) {
		move(a, b); // this is call delegation
		// a method used to call another method that encompasses all its responsibilities hence delegate
		//x = a;
		//y = b;
	}
	
	public double getX() {
		return (double)x;
	}

	public double getY() {
		return (double)y;
	}
	
	/*
	public String display() {
		return String.format("(%d,%d)", x, y);
	}
	*/
	
	@Override // aids the compiler in aiding us
	public String toString() {
		return String.format("(%d,%d)", x, y);
	}
	
	public double distanceTo(Point other) {
		double addend1 = Math.pow(x - other.x, 2);
		double addend2 = Math.pow(y - other.y, 2);
		return Math.sqrt(addend1 + addend2);
	}
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
 }