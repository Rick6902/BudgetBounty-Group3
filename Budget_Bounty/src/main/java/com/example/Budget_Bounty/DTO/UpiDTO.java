package com.example.Budget_Bounty.DTO;

public class UpiDTO {

    private String senderAccountID;
    private String upiAddress;
    private String cnfupiAddress;
    private String beneficiaryName;
    private final String type="UPI";
   

	private String amount;
    private String note;

    public UpiDTO(String senderAccountID, String upiAddress, String cnfupiAddress, String beneficiaryName, String amount, String note) {
        this.senderAccountID = senderAccountID;
        this.upiAddress = upiAddress;
        this.cnfupiAddress = cnfupiAddress;
        this.beneficiaryName = beneficiaryName;
        this.amount = amount;
        this.note = note;
    }

    public String getType() {
		return type;
	}
    public String getSenderAccountID() {
        return senderAccountID;
    }

    public void senderAccountID(String senderId) {
        this.senderAccountID = senderId;
    }

    public String getUpiAddress() {
        return upiAddress;
    }

    public void setUpiAddress(String upiAddress) {
        this.upiAddress = upiAddress;
    }

    public String getCnfupiAddress() {
        return cnfupiAddress;
    }

    public void setCnfupiAddress(String cnfupiAddress) {
        this.cnfupiAddress = cnfupiAddress;
    }

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "UpiDTO{" +
                "senderId=" + senderAccountID +
                ", upiAddress='" + upiAddress + '\'' +
                ", cnfupiAddress='" + cnfupiAddress + '\'' +
                ", beneficiaryName='" + beneficiaryName + '\'' +
                ", amount='" + amount + '\'' +
                ", note='" + note + '\'' +
                '}';
    }

	
}
