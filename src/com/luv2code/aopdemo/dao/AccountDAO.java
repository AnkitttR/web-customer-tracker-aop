package com.luv2code.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component    //spring will find it automatically using component scanning //Hey this is a component
public class AccountDAO {
	
	private String name;
	private String serviceCode;
	
	// add a new method: findAccounts()
	
	public List<Account> findAccounts(){
		
		List<Account> myAccounts = new ArrayList<>();
		
		// create sample accounts
		
		
		//add them to our accounts list
		
		
		return myAccounts;
		
	}

	public void addAccount(Account theAccount, boolean vipFlag) {
		
		System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
	}
	
	public boolean doWork() {
	
	System.out.println(getClass() + ": doWork()");
	return false;
	
	}

	public String getName() {
		System.out.println(getClass() + ": in getName()");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass() + ": in setName()");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(getClass() + ": in GetServiceCode()");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() + ": in setServiceCode()");
		this.serviceCode = serviceCode;
	}
	
	
	
}

