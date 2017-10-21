public class MailMerge {

	public final Employees SENDER;

	// specifies the sender whom is Employees object (Huckster
	public MailMerge(Employees sender) {
		SENDER = sender;
	}

	// prints the message for each of the recipients
	public void send(Employees[] recipients) {
		final String S_NAME = SENDER.getName();
		final String S_EMAIL = SENDER.getEmail();	

		for (Employees person : recipients) {			
			String name = person.getName();
			String email = person.getEmail();
			
			String msg = String.format("\nFrom: %s <%s>\n" +
			                "To: %s <%s>\nHello %s, Thingamajig.com would like " +
			                "to be your new very best number one supplier. " + 
			                "Contact us for more details.", S_NAME, S_EMAIL, 
			                name, email, name);
			
			System.out.println(msg);		
		}
	}
}