public class Employee {

	public final String NAME;
	public final double HOURS;
	public final double WAGE;
	public final int PIECES;
	public final double RATE;
	
	public Employee(String name, double hours, double wage, int pieces, double rate) {
		NAME = name;
		HOURS = hours;
		WAGE = wage;
		PIECES = pieces;
		RATE = rate;
	}
	
	public double getPay() {
		double pay = HOURS * WAGE;
		if (HOURS[i] > 40)
			pay += .5 * WAGES * (HOURS - 40);
		pay += PIECES * RATES;
		return pay;
	}
	
	@Override
	public String toStringing() {
		return NAME;
	}
}	