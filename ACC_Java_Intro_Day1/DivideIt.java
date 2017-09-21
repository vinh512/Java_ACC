public class DivideIt {
	public static void main(String[] args) {
		final String NUM1 = System.console().readLine("Enter a dividend: ");
		final String NUM2 = System.console().readLine("Enter divisor: ");
		
		int num1 = Integer.parseInt(NUM1);
		int num2 = Integer.parseInt(NUM2);
		
		int quotient = num1 / num2;
		
		System.out.println(quotient);
	}
}