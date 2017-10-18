public class Payroll2 {
	public static void main(String[] args) {
		Employee alice = new Employee("Alice", 40.0, 80_000/52/40, 0, 0.0);
		Employee bob = new Employee("Bob", 42.5, 19.75, 0, 0);
		Employee gene = new Employee("Gene", 30.25, 9.50, 818, 0.27);
		
		Employee[] staff = {alice, bob, gene};
		
		double companyGross = 0.0;
		
		for (Employee e : staff) {
			double pay = e.getPay();
			System.out.printf("%s earned $%.2f this week\n", e, pay);//we can just put e instead of e.NAME because of the toString we overrode
			companyGross += e.getPay();
		}
		
		System.out.printf("Gross company payroll is $%.2f\n", companyGross);
	}
}