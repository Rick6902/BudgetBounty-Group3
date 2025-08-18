package com.example.Budget_Bounty.Models;



import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpiId {
	

    public String getUpiId() {
		return upiId;
	}

	public void setUpiId(String upiId) {
		this.upiId = upiId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getUpiAddress() {
		return upiAddress;
	}

	public void setUpiAddress(String upiAddress) {
		this.upiAddress = upiAddress;
	}

	public UpiId() {
		super();
	}

	public UpiId(String upiId, User user, String upiAddress) {
		super();
		this.upiId = upiId;
		this.user = user;
		this.upiAddress = upiAddress;
	}

	@Id
    private String upiId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String upiAddress;
}
