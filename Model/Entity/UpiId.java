import java.time.LocalDateTime;

/**
 * Represents a UPI ID linked to a user.
 */
public class UpiId {
    private Long upiId;                // Unique UPI ID record identifier
    private Long userId;               // Reference to user
    private String upiAddress;         // UPI handle/address (e.g., user@bank)
    private LocalDateTime linkedAt;    // Date/time the UPI ID was linked
    private String status;             // Status (active/inactive)
	public Long getUpiId() {
		return upiId;
	}
	public void setUpiId(Long upiId) {
		this.upiId = upiId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUpiAddress() {
		return upiAddress;
	}
	public void setUpiAddress(String upiAddress) {
		this.upiAddress = upiAddress;
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
	public UpiId(Long upiId, Long userId, String upiAddress, LocalDateTime linkedAt, String status) {
		super();
		this.upiId = upiId;
		this.userId = userId;
		this.upiAddress = upiAddress;
		this.linkedAt = linkedAt;
		this.status = status;
	}

}

