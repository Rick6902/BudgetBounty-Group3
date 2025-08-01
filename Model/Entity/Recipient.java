import java.time.LocalDateTime;

/**
 * Represents a payee/recipient to whom payments/money can be sent.
 */
public class Recipient {
    private Long recipientId;          // Unique identifier for the recipient entry
    private Long userId;               // Associated user (who owns/saved this recipient)
    private String name;               // Recipient's name
    private Long upiId;                // Reference to recipient's UPI ID (if any)
    private String accountNumber;      // Recipient's account number, if any
    private String ifsc;               // Recipient's bank IFSC code, if any
    private String bankName;           // Recipient's bank name, if any
    private LocalDateTime createdAt;   // Date/time recipient was added
    private String status;             // Recipient status (active/inactive)
	public Long getRecipientId() {
		return recipientId;
	}
	public void setRecipientId(Long recipientId) {
		this.recipientId = recipientId;
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
	public Long getUpiId() {
		return upiId;
	}
	public void setUpiId(Long upiId) {
		this.upiId = upiId;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Recipient(Long recipientId, Long userId, String name, Long upiId, String accountNumber, String ifsc,
			String bankName, LocalDateTime createdAt, String status) {
		super();
		this.recipientId = recipientId;
		this.userId = userId;
		this.name = name;
		this.upiId = upiId;
		this.accountNumber = accountNumber;
		this.ifsc = ifsc;
		this.bankName = bankName;
		this.createdAt = createdAt;
		this.status = status;
	}

}
