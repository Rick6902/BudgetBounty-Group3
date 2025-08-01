/**
 * Represents a user of the BudgetBounty application.
 */
import java.time.LocalDateTime;
public class User {
    private Long userId;           // Unique identifier for the user
    private String name;           // User's full name
    private String email;          // User's email address (used for login/communication)
    private String passwordHash;   // Secure hash of user's password
    private String phoneNumber;    // User's contact phone number
    private LocalDateTime registeredAt; // Date and time of user registration
    private LocalDateTime lastLogin;    // Last login date and time
    private String status;         // Account status (e.g., active, suspended)
    private String userType;       // User category (e.g., user, admin)
	
    public User(Long userId, String name, String email, String passwordHash, String phoneNumber,
			LocalDateTime registeredAt, LocalDateTime lastLogin, String status, String userType) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.passwordHash = passwordHash;
		this.phoneNumber = phoneNumber;
		this.registeredAt = registeredAt;
		this.lastLogin = lastLogin;
		this.status = status;
		this.userType = userType;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswordHash() {
		return passwordHash;
	}
	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public LocalDateTime getRegisteredAt() {
		return registeredAt;
	}
	public void setRegisteredAt(LocalDateTime registeredAt) {
		this.registeredAt = registeredAt;
	}
	public LocalDateTime getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(LocalDateTime lastLogin) {
		this.lastLogin = lastLogin;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
}
