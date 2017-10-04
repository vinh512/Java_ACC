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
		
		while (beerCount != 0) {
			coin = input.nextLine();
			
			switch(coin) {
				case "H": total += 0.50; break;
				case "Q": total += 0.25; break;
				case "D": total += 0.10; break;
				case "N": total += 0.50; break;
				default : System.out.println("Do not recognize coin"); break;
			}
			
			
		}
		
		
		
		
		
	}
}