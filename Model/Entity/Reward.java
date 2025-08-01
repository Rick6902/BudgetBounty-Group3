import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Reward earned by a user for their financial activities.
 */
public class Reward {
	
    public Reward(Long rewardId, Long userId, Long txnId, String rewardType, BigDecimal rewardValue, Boolean redeemed,
			LocalDateTime rewardDate, LocalDateTime expiryDate) {
		super();
		this.rewardId = rewardId;
		this.userId = userId;
		this.txnId = txnId;
		this.rewardType = rewardType;
		this.rewardValue = rewardValue;
		this.redeemed = redeemed;
		this.rewardDate = rewardDate;
		this.expiryDate = expiryDate;
	}
	public Long getRewardId() {
		return rewardId;
	}
	public void setRewardId(Long rewardId) {
		this.rewardId = rewardId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getTxnId() {
		return txnId;
	}
	public void setTxnId(Long txnId) {
		this.txnId = txnId;
	}
	public String getRewardType() {
		return rewardType;
	}
	public void setRewardType(String rewardType) {
		this.rewardType = rewardType;
	}
	public BigDecimal getRewardValue() {
		return rewardValue;
	}
	public void setRewardValue(BigDecimal rewardValue) {
		this.rewardValue = rewardValue;
	}
	public Boolean getRedeemed() {
		return redeemed;
	}
	public void setRedeemed(Boolean redeemed) {
		this.redeemed = redeemed;
	}
	public LocalDateTime getRewardDate() {
		return rewardDate;
	}
	public void setRewardDate(LocalDateTime rewardDate) {
		this.rewardDate = rewardDate;
	}
	public LocalDateTime getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDateTime expiryDate) {
		this.expiryDate = expiryDate;
	}
	private Long rewardId;             // Unique reward identifier
    private Long userId;               // The user who earned the reward
    private Long txnId;                // Related transaction (if applicable)
    private String rewardType;         // Type of reward (cashback/points)
    private BigDecimal rewardValue;    // Amount or value of the reward
    private Boolean redeemed;          // Has the reward been redeemed/used?
    private LocalDateTime rewardDate;  // Date/time the reward was issued
    private LocalDateTime expiryDate;  // Expiry date/time for the reward
}
