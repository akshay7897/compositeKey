package com.product.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class AccountPk implements Serializable {
	
	private Integer id;
	private String accountNo;
	private String accountType;
	
	 public AccountPk() {

	 }
	 
	public AccountPk(Integer id, String accountNo, String accountType) {
		super();
		this.id = id;
		this.accountNo = accountNo;
		this.accountType = accountType;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "AccountPk [id=" + id + ", accountNo=" + accountNo + ", accountType=" + accountType + "]";
	}
	
	
	
	
	
	
	

}
