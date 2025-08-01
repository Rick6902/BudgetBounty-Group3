import java.time.LocalDateTime;

/**
 * Payment method linked to a user (UPI, Bank, Wallet, etc.).
 */
public class PaymentMethod {
    private Long methodId;             // Unique method identifier
    private Long userId;               // Owner user
    private String methodType;         // e.g., UPI/NEFT/RTGS/Wallet
    private String details;            // Additional info (e.g., wallet ID, card info in JSON)
    private LocalDateTime linkedAt;    // Link date/time
    private String status;             // Active/inactive
	public Long getMethodId() {
		return methodId;
	}
	public void setMethodId(Long methodId) {
		this.methodId = methodId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getMethodType() {
		return methodType;
	}
	public void setMethodType(String methodType) {
		this.methodType = methodType;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
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
	public PaymentMethod(Long methodId, Long userId, String methodType, String details, LocalDateTime linkedAt,
			String status) {
		super();
		this.methodId = methodId;
		this.userId = userId;
		this.methodType = methodType;
		this.details = details;
		this.linkedAt = linkedAt;
		this.status = status;
	}

}
