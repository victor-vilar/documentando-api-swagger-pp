package documentando.api.rest.model;

public class ApiUser {
	
	private Integer id;
	private String login;
	private String password;
	
	public ApiUser() {
		
	}
	
	public ApiUser(String login, String password) {
		this.login = login;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User{"+
				"login='" + login + '\'' +
				", password='" + password + '\'' +
				'}';
	}
}
