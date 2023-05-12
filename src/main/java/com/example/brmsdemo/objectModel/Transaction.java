package com.example.brmsdemo.objectModel;

import java.time.LocalDateTime;

public class Transaction {
	private String transactionId;
	private String type;
	private double ammount;
	private LocalDateTime transactionDateTime;
	private Account account;
	private String status;
	
	public Account getAccount() {
		return account;
	}
	
	public void setAccount(Account account) {
		this.account=account;
	}
	
	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmmount() {
		return ammount;
	}

	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}

	public LocalDateTime getTransactionDateTime() {
		return transactionDateTime;
	}

	public void setTransactionDateTime(LocalDateTime transactionDateTime) {
		this.transactionDateTime = transactionDateTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
