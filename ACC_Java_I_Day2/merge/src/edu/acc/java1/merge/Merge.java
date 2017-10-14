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
		
		Employees[] employees = new Employees[3];
		employees[0] = new Employees("Alice", "aa@widgets.inc");
		employees[1] = new Employees("Bob", "bb@widgets.inc");
		employees[2] = new Employees("Gene", "gg@geocities.com");
		
		for (int i = 0; i < employees.length; i++) {
			printEmail(employees[i]);			
		}
	}
	
	private static void printEmail(Employees recipient) {
		System.out.println("\nFrom: Huckster <supplier@thingamajig.com>");
		System.out.println("To: " + recipient.getName() + " <" + recipient.getEmail() + ">");
		System.out.println("Hello " + recipient.getName() + ", Thingamajig.com would " +
						   "like to be your new very best number one supplier. " + 
						   "Contact us for more details.");	
	}
}