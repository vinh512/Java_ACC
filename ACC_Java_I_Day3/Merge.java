package edu

public class Merge {
	public static void main(String[] args) {
		// Who are the contacts we're targeting?
		Contact alice = new Contact("Alice", "aa@widgets.inc");
		Contact bob = new Contact("Bob",   "bb@widgets.inc");
		Contact gene = new Contact("Gene",  "gg@geocities.com");
		
		Contact[] targets = {alice, bob, gene};
		
		// Who's sending the message?
		Contact sender = new Contact("Huckster", "supplier@thingamajig.com");
		
		String message = "Hello <name>, Thingamajig.com would like to be your new " +
						 "very best number one supplier. Contact us for more details.";
						 
		MailMerge merger = new MailMerge(sender);
		
		//merge.send(targets, message);
		
		for (Contact target : targets) {
			String output = merger.send(target, message);
			System.out.printf("\n%s\n", output);
		}
		
	}
	
	
}