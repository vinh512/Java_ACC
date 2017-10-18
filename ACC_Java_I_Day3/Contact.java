public class Contact {
	public final String NAME;
	public final String EMAIL;
	
	public Contact(String name, String email) {
		NAME = name;
		EMAIL = email;
	}
	
	@Override 
	public String toString() {
		return String.format("%s <%s>", NAME, EMAIL);
	}
}