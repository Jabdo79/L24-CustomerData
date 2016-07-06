package cust.data.users;

public class User {
	private int id;
	private String name;
	private String pass;
	private String email;
	private String fullname;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPass() {
		return pass;
	}

	public String getEmail() {
		return email;
	}
	
	public String getFullname() {
		return fullname;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
}
