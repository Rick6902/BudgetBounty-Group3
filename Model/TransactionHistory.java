import java.time.LocalDateTime;

/**
 * Tracks actions/events in the lifecycle of a transaction (audit trail).
 */
public class TransactionHistory {
    private Long historyId;            // Unique event identifier
    private Long txnId;                // Related transaction
    private String actionType;         // Action taken (initiated/processed/failed/success)
    private LocalDateTime actionTimestamp; // Time the action occurred
    private String note;               // Details or message regarding the action
	public Long getHistoryId() {
		return historyId;
	}
	public void setHistoryId(Long historyId) {
		this.historyId = historyId;
	}
	public Long getTxnId() {
		return txnId;
	}
	public void setTxnId(Long txnId) {
		this.txnId = txnId;
	}
	public String getActionType() {
		return actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
	public LocalDateTime getActionTimestamp() {
		return actionTimestamp;
	}
	public void setActionTimestamp(LocalDateTime actionTimestamp) {
		this.actionTimestamp = actionTimestamp;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public TransactionHistory(Long historyId, Long txnId, String actionType, LocalDateTime actionTimestamp,
			String note) {
		super();
		this.historyId = historyId;
		this.txnId = txnId;
		this.actionType = actionType;
		this.actionTimestamp = actionTimestamp;
		this.note = note;
	}

}
