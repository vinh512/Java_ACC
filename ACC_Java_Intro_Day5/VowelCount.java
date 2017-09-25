/*
	A java program called VowelCount that counts the number of times each
	vowel appears in a quote.

	Example Output:
	a: 4
	e: 2
	i: 0
	o: 3
	u: 1
*/

public class VowelCount {
	
	public static void main(String[] args) {
		
		final String QUOTE = "If I have seen further, it is by standing " +
		"upon the shoulders of giants.";
		
		final String QUOTE2 = QUOTE.toLowerCase();
		
		char[] vowelArr = { 'a', 'e', 'i', 'o', 'u' };
		int[] vowelCount = new int[5];
		
		// i is the char index of the String quote
		// j is the vowel index of the vowel array, vowelArr
		for (int i = 0; i < QUOTE2.length(); i++) {
			for (int j = 0; j < vowelArr.length; j++) {
				if (vowelArr[j] == QUOTE2.charAt(i)) {
				vowelCount[j]++;
				break;
				}
			}
		}
		
		// k is the vowel count of the vowelCount arry
		for (int k = 0; k < vowelCount.length; k++) {
			System.out.println(vowelArr[k] + ": " + vowelCount[k]);
		}
	}
}