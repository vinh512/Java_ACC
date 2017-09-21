public class Addit {
	public static void main(String[] args) {
		final String NUM1 = System.console().readLine("Enter a number: ");
		final String NUM2 = System.console().readLine("Enter another: ");
		
		double num1 = Double.parseDouble(NUM1);
		double num2 = Double.parseDouble(NUM2);
		
		double sum = num1 + num2;
		
		System.out.println(sum);
	}
}