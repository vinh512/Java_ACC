/*
	Program simulates a game of Craps. Based on the results, it will display
	whether you won, lost, or need to continue rerolling for the point value.

	@Author Vinh Huynh
	@version 1.0
*/

public class Craps {
	
	public static void main(String[] args) {					
		
		int dice1, dice2, sum, point;
		
		dice1 = getRandomNum();
		dice2 = getRandomNum();		
		sum = dice1 + dice2; 
		
		switch (sum) {
			// Win conditions
			case 2: case 3: case 12: 
				System.out.println(printMsg(dice1, dice2, sum, "lose")); break;
			// Lose conditions
			case 7: case 11:
				System.out.println(printMsg(dice1, dice2, sum, "win")); break;
			// Reroll conditions
			default:
				point = sum; // Stores the sum value to the point variable					
				System.out.println(printMsg(dice1, dice2, sum, ""));
				System.out.println("Your point number is " + point + ". Roll it again to win!");								 
				
				// Continue rerolling for point value
				do { 
					dice1 = getRandomNum();
					dice2 = getRandomNum();
					sum = dice1 + dice2;
					
					if (sum == 7) {
						System.out.println(printMsg(dice1, dice2, sum, "lose"));
						return;
					} else if (sum == point) {
						System.out.println(printMsg(dice1, dice2, sum, "win"));
						return;
					} 					
					System.out.println(printMsg(dice1, dice2, sum, "roll"));					
				} while (sum != 7 || sum != point);
				
				break;
		} // end of switch		
	}
	
	// Generates a random integer from 1-to-6
	private static int getRandomNum() {
		return (int)(Math.random() * 6) + 1;
	}
	
	// Creates a String of the results
	private static String printMsg(int d1, int d2, int sum, String result) {
		String appendMsg = "";
		
		switch (result) {
			case "lose": appendMsg = " You lose!"; break; 
			case "win" : appendMsg = " You win!"; break;
			case "roll": appendMsg = " Roll again!"; break;
			default:     appendMsg = ""; break;
		}				
		return "You rolled " + d1 + " and " + d2 + " for a total of " + sum + "." + appendMsg;
	}
}
