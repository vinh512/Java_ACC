public class CrapsGame {
	public static void main(String[] args) {
	
	Die die1 = new Die();
	Die die2 = new Die();
	
	int d1 = die1.getValue();
	int d2 = die2.getValue();
	
	System.out.printf("d1: %d\n", d1);
	System.out.printf("d2: %d\n", d2);

	// Since I used the static modifier for the getSum method,
	// it requires the class (Die) to invoke
	int sum = Die.getSum(d1, d2);

	System.out.printf("sum: %d\n", sum);
	}
}