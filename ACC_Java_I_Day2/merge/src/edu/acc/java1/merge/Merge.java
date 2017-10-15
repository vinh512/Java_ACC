/*
	Let's simulate mail merge. There are three recipients: Alice, Bob, and Gene.
	Their email addresses are, respectively, aa@widgets.inc, bb@widgets.inc, and
	gg@geocities.com. The message is addressed from supplier@thingamajig.com to 
	each of the three and says "Hello <name>, Thingamajig.com would like to be 
	your new very best number one supplier. Contact us for more details."
	
	Write a Java program to simulate sending the message to each of the three 
	employees at Widgets, Inc. with their name substituted in the appropriate 
	place in the message. Just display the completed message to indicate it was 
	"sent".
*/

public class Merge {
	public static void main(String[] args) {
		// create an array to hold 3 Employee objects
		Employees[] recipients = new Employees[3];
		
		// populate array with instances of Employees
		recipients[0] = new Employees("Alice", "aa@widgets.inc");
		recipients[1] = new Employees("Bob", "bb@widgets.inc");
		recipients[2] = new Employees("Gene", "gg@geocities.com");
		
		// iterate through array and call print method
		for (Employees recipient : recipients)
			printMsg(recipient);
	}
	
	// prints out the email message with the corresponding employee
	private static void printMsg(Employees recipient) {
		final String NAME = recipient.getName();
		System.out.printf("\nFrom: Huckster <supplier@thingamajig.com>\n");
		System.out.printf("To: %s <%s>\n", NAME, recipient.getEmail());
		System.out.printf("Hello %s, Thingamajig.com would like to be your new " +
						  "very best number one supplier. Contact us for more " +
						  "details.\n", NAME);	
	}
}