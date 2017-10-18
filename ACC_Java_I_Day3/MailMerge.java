public class MailMerge {
	
	public final Contact SENDER;
	
	public MailMerge(Contact sender) {
		SENDER = sender;
	}
	
	// IF WE BRING THE FOR LOOP HERE
	//public void send(Contact[] recipient, String message) {
		
	public String send(Contact recipient, String message) {
		// can make variables constants but not big performance boost cuz heavy lifting done in main
		int start = message.indexOf("<");
		int end   = message.indexOf(">") + 1; // add one to lose the inclusion of the '>'
		
		int size  = message.length() + recipient.toString().length() + SENDER.toString().length();
		
		// need to add in a length value because default is 16chars
		StringBuilder sb = new StringBuilder(size);
		
		sb.append("From: ").append(SENDER).append("\n");
		sb.append("To: ").append(recipient).append("\n");
		sb.append("Message: ").append(message.substring(0, start));
		sb.append(recipient.NAME);
		sb.append(message.substring(end));
		
		// System.out.print(sb.toString()) IF WE BRING IN THE FOR LOOP
		return sb.toString();
	}
}