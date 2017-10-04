/*
	A D&D Character has 6 Traits: Strength, Dexterity, Charisma, Constitution,
	Intellect, and Wisdom. New characters are created by rolling a 6-sided dice
	4 times(4d6) and discarding the lowest roll. The sum of the remaining three 
	becomes the stat. Roll a random D&D character and print its stats.
	
	Strength: 16
	Dexterity: 9
	Charisma: 7
	Constitution: 15
	Intellect: 6
	Wisdom: 6
*/

public class DND {
	public static void main(String[] args) {
	
		final String[] TRAITS = { "Strength", "Dexteriy", "Charisma",
								  "Constitution", "Intellect", "Wisdom" };
							
		System.out.println("");
		for (String trait : TRAITS) {
			System.out.printf("%s: %d\n", trait, rollForStat());		
		}	
	}
	
	// Rolls 6-sided dice 4 times and removes lowest value, returns sum total
	private static int rollForStat() {		
		int sum = 0, min = 7;
		
		for (int roll = 1; roll <= 4; roll++) {
			int val = (int)(Math.random() * 6) + 1;
			if (val < min) min = val;
			sum += val;
		}
		return sum - min;	
	}
}