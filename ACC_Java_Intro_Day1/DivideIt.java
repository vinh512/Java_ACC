/* Day 2 Assignment 2
	Write the Java program DivideIt to display the quotient
	of two integers given on the command line.
	Java uses the forward-slash as the division operator.
	
	compile with: javac DivideIt.java
	run with: java DivideIt number number
*/

public class DivideIt {
	public static void main(String[] args) {
		
		// Have user enter 2 values
		final String NUM1 = System.console().readLine("Enter a dividend: ");
		final String NUM2 = System.console().readLine("Enter divisor: ");
		
		// Convert the string values into integers
		int num1 = Integer.parseInt(NUM1);
		int num2 = Integer.parseInt(NUM2);
		
		// Calculate the quotient
		final int QUOTIENT = num1 / num2;
		
		// Send output to console
		System.out.println(QUOTIENT);
	}
}