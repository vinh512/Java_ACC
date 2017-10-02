/*
	The Die object. It gets a random value for the die.
	And has a static method to return the sum.
*/

public class Die {

	private int value = (int)(Math.random() * 6) + 1;

	// I could've simply returned the statement above but I want to practice
	// using the 'this' keyword
	public int getValue() {
		return this.value;	
	}
	
	// I used the static modifier so that it is a class call
	public static int getSum(int die1, int die2) {
		return die1 + die2;	
	}
}