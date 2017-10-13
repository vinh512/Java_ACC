package edu.acc.java1.geometry;

public class Point3D extend Point{
	// public int x;
	// public int y;
	public int z;
	
	public Point3D(int x, int y, int z) {
		move(x, y, z);
	}
	
	public void move(int x, int y, int z) {
		// this.x = x;
		// this.y = y;
		super.move(x, y); // the Point class which is the direct parent class hence super
		this.z = z;
	}
	
	@Override 
	public String toString() {
		return String.format("(%d, %d, %d)", x, y, z);
	}
	
}