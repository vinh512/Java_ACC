public class Reps {
	public static void main(String[] args) {
		
		// Checks to see if 1 argument was provided
		if (args.length != 1) {
			System.out.println("USAGE: java Reps (String)");
			return;
		}
		
		// Prints the String 6 times on one line
		for (int i = 1; i <= 6; i++)  
			System.out.print(args[0]);   
		
		System.out.println("");  
		
		// Prints the String once each on their own lines
		for (int j = 1; j <= 6; j++)
			System.out.println(args[0]);
	}
}