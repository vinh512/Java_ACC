/*
	Write a java program to simulates a vending machine that accepts four coin
	denominations and returns the change and/or coins if no item is available
*/

import java.util.Scanner; 

public class VendingMachine {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		final double BEER_COST = 1.75;
		int beerCount = 5;
		double total = 0;
		String coin;
		
		do {
			System.out.println("\nH=$.50, Q=$.25, D=$.10, N=$.05");
			System.out.println("Please insert $1.75 for your beer.");
			
			while (total < BEER_COST) {	
				System.out.print("Enter coins: ");
				coin = input.nextLine().toUpperCase();
				
				switch(coin) {
					case "H": total += 0.50; break;
					case "Q": total += 0.25; break;
					case "D": total += 0.10; break;
					case "N": total += 0.50; break;
					default : System.out.println("Do not recognize coin"); break;
				}		
			}
					
			if (total >= BEER_COST) {
				System.out.println("Dispensing you beer - Enjoy!");
				beerCount--;
				if (total > BEER_COST) 
					System.out.printf("You inserted $%.2f. Here is your change: $%.2f\n", 
									   total, total - BEER_COST);				
			}
			
			total = 0; // Resets total to repeat while loop			
		} while (beerCount != 0); // End of do-while loop 
		
		System.out.println("Out of Beers!");
	}
}