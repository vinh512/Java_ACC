public class CoinToss {
	public static void main(String[] args) {
		
		if (args.length != 1) {
			System.out.println("Usage: java CoinToss (integer)");	
		}
		
		final int TOSSES = Integer.parseInt(args[0]);
				
		// Declare variables
		int headsCount, tailsCount; randomValue;
		// Initialize variables to all the same value
		headsCount = tailsCount = randomValue = 0;
		
		for (int i = 1; i <= TOSSES; i++) {
			// Generates random value from 0 thru 1
			randomValue = (int)(Math.random() * 2);
			
			if (randomValue == 0)
				headsCount++;
			else
				tailsCount++;			
		}
		System.out.println("Heads: " + headsCount);
		System.out.println("Tails: " + tailsCount);
	}
}
