/*
	The classic interview coding challenge - FizzBuzz
*/

public class FizzBuzz {
	
	public static void main(String[] args) {
		
		// Returns the current value of the running JVM time source in nanoseconds
		long start = System.nanoTime();
		
		for (int n = 1; n <= 100; n++) {
			
			if (n % 3 == 0 && n % 5 == 0) 
				System.out.println("FizzBuzz");
			else if (n % 3 == 0)
				System.out.println("Fizz");
			else if (n % 5 == 0) 
				System.out.println("Buzz");
			else
				System.out.println(n);
			
			/*
			String output = "";
			if (n % 3 == 0)
				output += "Fizz";
			if (n % 5 == 0)
				output += "Buzz";
			if (output.length() == 0)
				output += n;
			System.out.println(output);
			*/
		}
		
		long end = System.nanoTime();
		// Divide by a billion to convert ns to seconds
		System.out.printf("Execution in %.3f seconds\n", (end-start) / 1.0e9);		
	}
}