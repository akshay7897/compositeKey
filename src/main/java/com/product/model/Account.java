package com.product.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Account {
	
	private String accountHolderName;
	private Integer balance;
	private String city;
	
	@EmbeddedId
	private AccountPk accountPk;
	
	
	

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
		

	public Account(String accountHolderName, Integer balance, String city, AccountPk accountPk) {
		super();
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.city = city;
		this.accountPk = accountPk;
	}



	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public AccountPk getAccountPk() {
		return accountPk;
	}

	public void setAccountPk(AccountPk accountPk) {
		this.accountPk = accountPk;
	}


	@Override
	public String toString() {
		return "Account [accountHolderName=" + accountHolderName + ", balance=" + balance + ", city=" + city
				+ ", accountPk=" + accountPk + "]";
	}
	
	
	
	
	
	

}
