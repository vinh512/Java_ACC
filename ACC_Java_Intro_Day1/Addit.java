/* Day 2 Assignment 1
	Alter the Addit program to sum numbers like
	3.141 and -23.5 from the command-line.
	
	compile with: javac AdditDecimal.java
	run with: java AdditDecimal number number
*/

public class Addit {
	public static void main(String[] args) {
		
		// Have user enter 2 values
		final String NUM1 = System.console().readLine("Enter a number: ");
		final String NUM2 = System.console().readLine("Enter another: ");
		
		// Convert the string values into doubles
		double num1 = Double.parseDouble(NUM1);
		double num2 = Double.parseDouble(NUM2);
		
		// Calculate the sum
		double sum = num1 + num2;
		
		// Send output to console
		System.out.println(sum);
	}
}