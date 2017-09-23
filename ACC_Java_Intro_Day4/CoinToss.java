public class CoinToss {
	public static void main(String[] args) {
		
		int headsCount = 0, tailsCount = 0; 
		int randomValue = 0;
		
		for (int i = 1; i <= 10; i++) {
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
