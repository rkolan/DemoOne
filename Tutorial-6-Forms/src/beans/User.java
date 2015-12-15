package beans;

public class User {
	private String user="";
	private String password="";
	private String message ="";
	public String getMessage() {
		return message;
	}

	
	public User(){
		
	}
	
	public User(String user, String password) {
	
		this.user = user;
		this.password = password;
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
public boolean validate(){
	if(user==null) {
		message="No email address set";
		return false;
	}
	
	if(password==null) {
		message="No password entered";
		return false;
	}
	if(!user.matches("\\w+@\\w+\\.\\w+")) {
		message="Invalid email address";
		return false;
	}
	if(password.length()<8) {
		message="password must be 8 characters.";
		return false;
	}
	else if(password.matches("\\w*\\s+\\w*")){
		message="password cannot contain space";
		return false;
	}
	return true;
}

}
