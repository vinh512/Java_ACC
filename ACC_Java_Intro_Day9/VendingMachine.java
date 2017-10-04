/*
	Write a java program to simulates a vending machine that accepts four coin
	denominations and returns the coins if no item is available
*/

import java.util.Scanner; 

public class VendingMachine {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int beerCount = 5;
		double total = 0;
		String coin;
		
		System.out.println("\nH=$.50, Q=$.25, D=$.10, N=$.05");
		System.out.println("Please insert $1.75 for your beer");
		while (total < 1.75) {
			
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
		
		
			if (total >= 1.75) {
				System.out.println("Dispensing - Enjoy your beer!");
				beerCount--;
				if (total > 1.75) 
					System.out.printf("You inserted $%.2f. Here is your change: $%.2f\n", 
								   	   total, total - 1.75);				
			}
		
		
		
		
		
	}
}