/*
	Guessing game using javax.swing.JOptionPane
*/

import javax.swing.JOptionPane;

public class GuessingGame {
	
	public static void main(String[] args) {
		
		// welcome the player (splash/banner)
		//System.out.println("I've picked a number between 1 and 100 inclusive.");
		JOptionPane.showMessageDialog(null, "I've picked a number between 1 and 100 inclusive.");		
		
		// pick a random number between 1 and 100
		final int THE_NUMBER = (int)(Math.random()*100) + 1;
		int guess = 0, tries = 0;
		String prompt = "Guess my number: ";
		
		while (guess != THE_NUMBER) {
			// prompt the user for a guess			
			//String input = System.console().readLine(prompt);
			String input = JOptionPane.showInputDialog(null, prompt);
			// increment guesses
			tries++;
			
			if (input == null) {
				JOptionPane.showMessageDialog(null, "Goodbye!");
				return;
			} else if (input.equals("")) {
				JOptionPane.showMessageDialog(null, "Please type a guess");
				continue;
			}
			
			// read/parse the guess
			guess = Integer.parseInt(input);						
			
			if (guess < THE_NUMBER) {
				prompt = "Guess higher: ";
			} else if (guess > THE_NUMBER) {
				prompt = "Guess lower: ";				
			}
		}		
		// when the guess is just right, terminate with a guess count
		
		//String plural = "tries";
		//if (tries == 1) plural = "try";
		
		//System.out.printf("You guessed my number in %d tr%s!\n", tries, (tries == 1 ? "y" : "ies"));
		String message = String.format("You guessed my number in %d tr%s!", tries, (tries == 1 ? "y" : "ies"));
		JOptionPane.showMessageDialog(null, message); 
	}
}

