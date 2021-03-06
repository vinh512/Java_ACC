public class Calc {
	public static void main(String[] args) {
		
		// Checks to see if 3 arguments are provided
		if (args.length != 3) {
			System.out.println("USAGE: java Calc (number) (operator: +/-%x) (number)");
			return;
		}
		
		final double NUM1 = Double.parseDouble(args[0]);
		final double NUM2 = Double.parseDouble(args[2]);		
		final String OPERATOR = args[1];
		double result = 0.0;
		
		switch(OPERATOR) {
			case "+":
				result = NUM1 + NUM2;
				break;
			case "/":
				result = NUM1 / NUM2;
				break;
			case "-":
				result = NUM1 - NUM2;
				break;
			case "%":
				result = NUM1 % NUM2;
				break;
			// the multiplication symbol(*) is read as wildcard in the commdand line
			// so we use 'x' instead as expressed in the usage message
			case "x":
				result = NUM1 * NUM2;
			default: 
				System.out.println("Please enter a valid operator");
				return;
		}	
		System.out.println(result);
	}
}