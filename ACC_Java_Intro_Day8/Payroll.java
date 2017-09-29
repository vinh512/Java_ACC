/* 
Widgets Inc, is an exciting new start-up that needs your Java skill for its
in-house software. The founder and CEO, Alice Alpha, needs an app to calculate
weekly payroll. Show her what you can do given the following information:
	
	Alice is a salaried employee earning 80,000 a year. She often works 
		60 hours or more.
	Bob Beta is an hourly employee, middle management, who earns 19.75 per hour
		and is awarded overtime as necessary. This week he worked 42.5 hours.
	Gene Gamma is the assembler building all the widgets. He earns 9.50 per hour,
		overtime as necessary, and also earns $0.27 per widget built.
		This week he worked 30.25 hours and built 818 widgets. 

Display each user's gross pay for the week as well as the company's total payroll.
Widgets Inc hopes to be a growing business and plans to add many new hourly,
salaried, and piecework employees in the coming months.
*/

public class Payroll {
	public static void main(String[] args) {
		
		// Gather your data points, declare your variables
		final String[] NAMES = {"Alice", "Bob", "Gene"};
		final double[] HOURS = {40.0, 42.5, 30.25};
		final double[] WAGES = {80_000.00/52/40, 19.75, 9.50};  
		final int[]   PIECES = {0, 0, 818};
		final double[] RATES = {0, 0, .27};
		
		double companyPayroll = 0.0;
		
		for (int i = 0; i <  NAMES.length; i++) {
			double pay = HOURS[i] * WAGES[i];
			// Accounts for overtime pay
			if (HOURS[i] > 40) 
				pay += 0.5 * WAGES[i] * (HOURS[i] - 40);
			
			pay += PIECES[i] * RATES[i];
			System.out.printf("%s earned $%.2f this week.\n", NAMES[i], pay);
			
			// Adds each person's pay to the company payroll total
			companyPayroll += pay;
		}	
		System.out.printf("Gross company payroll is: $%.2f\n", companyPayroll);	
	}
}
	

