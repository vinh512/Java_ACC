/*
	This is the Employees class used to create instances of Employees with
	name and email as fields.
*/

public class Employees {
	private String name;
	private String email;
	
	public Employees() {}; // default constructor
	
	public Employees(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public String getName() {
		return name;	
	}
	
	public String getEmail() {
		return email;	
	}
	
	public void setName(String name) {
		this.name = name;	
	}
	
	public void setEmail(String email) {
		this.email = email;	
	}
}