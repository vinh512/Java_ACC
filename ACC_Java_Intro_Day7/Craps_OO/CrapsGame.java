/*
	Practice Object Oriented Programming using the Craps game as a basis.
	The Die class has the logic for getting random values and the sum.
*/

public class CrapsGame {
	
	public static void main(String[] args) {
		
		int LOSE = 0, WIN = 1, POINT = 2; 
		int state, point = 0;
		
		// Create 2 dice objects
		Die die1 = new Die();
		Die die2 = new Die();
		
		int sum = rollDice(die1, die2);	
		
		if (sum == 2 || sum == 3 || sum == 12)			 
			state = LOSE; 
		else if (sum == 7 || sum == 11)				
			state = WIN; 
		else {
			state = POINT;
			point = sum; // Stores the sum value to the point variable									
		}		
		
		while (state == POINT) {
			System.out.printf("Your point is %d.\n", point);
			sum = rollDice(die1, die2);
			if (sum == 7) 
				state = LOSE;				
			else if (sum == point) 
				state = WIN;									 										
		}								
		
		if (state == WIN) 
			System.out.println("You Win!");
		else if (state == LOSE)
			System.out.println("You Lose!"); 
	}
	
	
	private static int rollDice(Die die1, Die die2) {
		// Call the Die getValue method to get a random value
		int d1 = die1.getValue();
		int d2 = die2.getValue();				

		// Since I used the static modifier for the getSum method,
		// it requires the class (Die) to invoke
		int sum = Die.getSum(d1, d2);
		
		// Await for user to hit enter
		System.console().readLine("Press enter to roll the dice!: ");
		
		System.out.printf("\nYou rolled %d + %d = %d.\n", d1, d2, sum);
		return sum;
	}
	
}