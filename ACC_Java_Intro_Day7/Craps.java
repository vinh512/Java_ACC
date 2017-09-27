/*
	Program simulates a game of Craps. Based on the results, it will display
	whether you won, lost, or need to continue rerolling for the point value.

	@Author Vinh Huynh
	@version 1.1 - reworked using the concept of states
*/

public class Craps {
	
	public static void main(String[] args) {					
		
		final int LOSE = 0, WIN = 1, POINT = 2;
		int state, point = 0;
		int sum = rollDice();
		
		switch (sum) {			
			case 2: case 3: case 12: // Win conditions 
				state = LOSE; 
				break;			
			case 7: case 11: // Lose conditions
				state = WIN; 
				break;			
			default: // Reroll conditions
				state = POINT;
				point = sum; // Stores the sum value to the point variable									
				
				while (state == POINT) {
					System.out.println("Your point is " + point + ". Roll again!");
					sum = rollDice();
					if (sum == 7) 
						state = LOSE;				
					else if (sum == point) 
						state = WIN;									 										
				}				
				break;
		} // end of switch
		
		if (state == WIN) 
			System.out.println("You Win!");
		else if (state == LOSE)
			System.out.println("You Lose!"); 			
	}
	
	// Gets the sum of dice rolls and displays a result message
	private static int rollDice() {
		// Prompts user to press enter key
		System.console().readLine("Press enter to roll the dice!: ");		
		int die1 = (int)(Math.random() * 6) + 1;
		int die2 = (int)(Math.random() * 6) + 1;
		int sum = die1 + die2;
		System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum + ".");
		return sum;
	}
}
