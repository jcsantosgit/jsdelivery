package br.net.jssantos.jsdelivery.entities;

public class User {
	private Long id;
	private String name;
	private UserType userType;
	private String email;
	
	public User() {}

	public User(Long id, String name, UserType userType, String email) {
		super();
		this.id = id;
		this.name = name;
		this.userType = userType;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
