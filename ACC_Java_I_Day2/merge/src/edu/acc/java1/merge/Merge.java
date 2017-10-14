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
		// I have 3 employees
		Employees alice = new Employees("Alice", "aa@widgets.inc");
		Employees bob = new Employees("Bob", "bb@widgets.inc");
		Employees gene = new Employees("Gene", "gg@geocities.com");
		
		// I print a message to each one
		System.out.println("\nFrom: Huckster <supplier@thingamajig.com>");
		System.out.println("To: " + alice.getName() + " <" + alice.getEmail() + ">");
		System.out.println("Hello " + alice.getName() + ", Thingamajig.com would " +
						   "like to be your new very best number one supplier. " + 
						   "Contact us for more details.");
		
		// I print a message to each one
		System.out.println("\nFrom: Huckster <supplier@thingamajig.com>");
		System.out.println("To: " + bob.getName() + " <" + bob.getEmail() + ">");
		System.out.println("Hello " + bob.getName() + ", Thingamajig.com would " +
						   "like to be your new very best number one supplier. " + 
						   "Contact us for more details.");
		
		// I print a message to each one
		System.out.println("\nFrom: Huckster <supplier@thingamajig.com>");
		System.out.println("To: " + gene.getName() + " <" + gene.getEmail() + ">");
		System.out.println("Hello " + gene.getName() + ", Thingamajig.com would " +
						   "like to be your new very best number one supplier. " + 
						   "Contact us for more details.");
	}
}