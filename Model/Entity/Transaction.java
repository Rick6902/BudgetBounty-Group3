import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Records a financial transaction performed by the user.
 */
public class Transaction {
    private Long txnId;                // Unique transaction identifier
    private Long userId;               // The user who initiated the transaction
    private Long recipientId;          // The recipient of the transaction
    private Long paymentMethodId;      // Payment method used (UPI/Bank/etc.)
    private BigDecimal amount;         // Transaction amount
    private String txnType;            // Transaction type (UPI/NEFT/IMPS/RTGS)
    private String txnStatus;          // Status (pending/completed/failed)
    private LocalDateTime txnDate;     // Date/time of transaction
    private String txnChannel;         // Channel used (app/web/etc.)
    private String remarks;            // Optional transaction notes
    private BigDecimal rewardsEarned;  // Rewards earned from this transaction (if any)
    private String currencyCode;       // Currency used for transaction (e.g., INR)
    private String referenceCode;      // External bank/reference code
	public Long getTxnId() {
		return txnId;
	}
	public void setTxnId(Long txnId) {
		this.txnId = txnId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getRecipientId() {
		return recipientId;
	}
	public void setRecipientId(Long recipientId) {
		this.recipientId = recipientId;
	}
	public Long getPaymentMethodId() {
		return paymentMethodId;
	}
	public void setPaymentMethodId(Long paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getTxnType() {
		return txnType;
	}
	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}
	public String getTxnStatus() {
		return txnStatus;
	}
	public void setTxnStatus(String txnStatus) {
		this.txnStatus = txnStatus;
	}
	public LocalDateTime getTxnDate() {
		return txnDate;
	}
	public void setTxnDate(LocalDateTime txnDate) {
		this.txnDate = txnDate;
	}
	public String getTxnChannel() {
		return txnChannel;
	}
	public void setTxnChannel(String txnChannel) {
		this.txnChannel = txnChannel;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public BigDecimal getRewardsEarned() {
		return rewardsEarned;
	}
	public void setRewardsEarned(BigDecimal rewardsEarned) {
		this.rewardsEarned = rewardsEarned;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getReferenceCode() {
		return referenceCode;
	}
	public void setReferenceCode(String referenceCode) {
		this.referenceCode = referenceCode;
	}
	public Transaction(Long txnId, Long userId, Long recipientId, Long paymentMethodId, BigDecimal amount,
			String txnType, String txnStatus, LocalDateTime txnDate, String txnChannel, String remarks,
			BigDecimal rewardsEarned, String currencyCode, String referenceCode) {
		super();
		this.txnId = txnId;
		this.userId = userId;
		this.recipientId = recipientId;
		this.paymentMethodId = paymentMethodId;
		this.amount = amount;
		this.txnType = txnType;
		this.txnStatus = txnStatus;
		this.txnDate = txnDate;
		this.txnChannel = txnChannel;
		this.remarks = remarks;
		this.rewardsEarned = rewardsEarned;
		this.currencyCode = currencyCode;
		this.referenceCode = referenceCode;
	}

}
