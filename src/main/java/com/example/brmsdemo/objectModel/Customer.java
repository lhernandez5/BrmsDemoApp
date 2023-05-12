package com.example.brmsdemo.objectModel;

public class Customer {
	private String customerId;
	private String name;
	private String address;
	private Account account;
	
	public Account getAccount() {
		return account;
	}
	
	public void setAccount(Account account) {
		this.account=account;
	}

	public String getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(String customerId) {
		this.customerId=customerId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}

}
