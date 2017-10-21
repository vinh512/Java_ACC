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
		// populate recipients array with instances of Employees
		Employees alice = new Employees("Alice", "aa@widgets.inc");
		Employees bob = new Employees("Bob", "bb@widgets.inc");
		Employees gene = new Employees("Gene", "gg@geocities.com");
		
		// create an array to hold 3 Employees objects
		Employees[] recipients = {alice, bob, gene};
		
		// create object for sender of the emails
		Employees sender = new Employees("Huckster", "supplier@thingamajig.com");
				
		// constructs and sends the messages to the recipients
		MailMerge merge = new MailMerge(sender);
		
		merge.send(recipients);
	}
}