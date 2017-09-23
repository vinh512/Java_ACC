public class NameFrame {
	public static void main(String[] args) {
		
		// Checks to see if an argument was entered
		if (args.length != 1) {
			System.out.println("USAGE: java NameFrame (name)");
			return;
		}
		
		final String NAME = args[0];
		final int NAME_LENGTH = NAME.length();
		
		makeFrame(NAME_LENGTH);
		System.out.println("| " + NAME + " |");
		makeFrame(NAME_LENGTH);
	}
	
	// Creates a frame spanning the length of the name 
	private static void makeFrame(int frameLength) {
		System.out.print("+-");
		for (int i = 0; i < frameLength; i++) {
			System.out.print("-"); 
		}
		System.out.println("-+");
	}
}