public class MailMerge {

	public final Employees SENDER;

	public MailMerge(Employees sender) {
		SENDER = sender;
	}
	
	public void send(Employees[] recipients) {
		final String S_NAME = SENDER.getName();
		final String S_EMAIL = SENDER.getEmail();		
		
		String msg = "";		
		
		for (Employees x : recipients) {
			msg = String.format("\nFrom: %s <%s>\n" +
			                "To: %s <%s>\nHello %s, Thingamajig.com would like " +
			                "to be your new very best number one supplier. " + 
			                "Contact us for more details.", S_NAME, S_EMAIL, 
			                x.getName(), x.getEmail(), x.getName());
			
			System.out.println(msg);		
		}
	}
}