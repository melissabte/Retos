package model;

public class Facebooklogin {
	
	String email;
	String password;
	public Facebooklogin(String email, String password) {
		
		this.email = email;
		this.password = password;
	}



	public String getemail() {
		return email;
	}
	public String getpassword() {
		return password;
	}

}
