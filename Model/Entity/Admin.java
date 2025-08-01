

public class Admin {
	private String adminId;
	private String username;
	private String password;
	private String email;
	private String role;
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Admin(String adminId, String username, String password, String email, String role) {
		super();
		this.adminId = adminId;
		this.username = username;
		this.password = password;
		this.email = email;
		this.role = role;
	}
	

}
