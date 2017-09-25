/*
Program creates a series of stars in descending order based on argument:

example: java Stars2 4
output : ****
 	 	  ***
 	 	   **
 	 	    *

@Author Vinh Huynh
@Version 1.0
*/

public class Stars2 {
	public static void main(String[] args) {
			
		if (args.length != 1) {
			System.out.println("Usage: java Stars2 (positive integer)");
			return;
		}
		
		final int RANGE = Integer.parseInt(args[0]);		
				   		
		/* The functionality consists of 3 for-loops. The outer for-loop represents 
		   the rows while the inner for-loops work together to create the String
		   output for each row */
		
		for (int row = 1; row <= RANGE; row++) {			
			// creates the blank spaces; increases as the rows increase
			for (int space = 1; space < row; space++) {
				System.out.print(" ");
			}
			// creates the stars; decreases as the rows increase
			for (int stars = RANGE; stars >= row; stars--) { 
				System.out.print("*");
			}			
			System.out.println("");
		}
	}
}