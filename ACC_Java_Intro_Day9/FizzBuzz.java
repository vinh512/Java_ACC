/*
	The classic interview coding challenge - FizzBuzz
*/

public class FizzBuzz {
	
	public static void main(String[] args) {
		
		long start = System.nanoTime();
		
		for (int n = 1; n <= 100; n++) {
			String output = "";
			if (n % 3 == 0)
				output += "Fizz";
			if (n % 5 == 0)
				output += "Buzz";
			if (output.length() == 0)
				output += n;
			System.out.println(output);
		}
		
		long end = System.nanoTime();
		System.out.printf("Execution in %.3f seconds\n", (end-start) / 1.0e9);		
	}

}