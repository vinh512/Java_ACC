public class Stars1 {
	public static void main(String[] args) {
		
		/* Using a nested for loop, the inner for-loop writes out a star the same
		   number of times as its rows */
		for (int row = 1; row <= 10; row++) {
			for (int star = 1; star <= row; star++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}