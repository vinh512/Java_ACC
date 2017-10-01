public class Die {

	private int value = (int)(Math.random() * 6) + 1;
	private int sum;
	
	public int getValue() {
		return this.value;	
	}
	
	// I used the static modifier so that it is a class call
	public static int getSum(int die1, int die2) {
		return die1 + die2;	
	}
}