import java.time.LocalDateTime;

/**
 * Represents a bank account linked to a user.
 */
public class BankAccount {
    private Long accountId;            // Unique bank account identifier
    private Long userId;               // Reference to owner user
    private String accountNumber;      // Bank account number
    private String ifsc;               // IFSC code for the bank/branch
    private String bankName;           // Name of the bank
    private String accountType;        // Type of account (savings/current)
    private LocalDateTime linkedAt;    // Account linking date and time
    private String status;             // Current status of this account (active/inactive)
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
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
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public LocalDateTime getLinkedAt() {
		return linkedAt;
	}
	public void setLinkedAt(LocalDateTime linkedAt) {
		this.linkedAt = linkedAt;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public BankAccount(Long accountId, Long userId, String accountNumber, String ifsc, String bankName,
			String accountType, LocalDateTime linkedAt, String status) {
		super();
		this.accountId = accountId;
		this.userId = userId;
		this.accountNumber = accountNumber;
		this.ifsc = ifsc;
		this.bankName = bankName;
		this.accountType = accountType;
		this.linkedAt = linkedAt;
		this.status = status;
	}

}
