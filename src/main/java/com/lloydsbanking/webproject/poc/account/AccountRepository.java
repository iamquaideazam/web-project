package com.lloydsbanking.webproject.poc.account;


import java.util.HashMap;
import java.util.Map;

public class AccountRepository 
{
	private static Map<Integer, Account> accountMap = new HashMap<Integer, Account>();
	
	// Making class singleton
	private static final AccountRepository ACCOUNT_REPOSITORY = new AccountRepository();
	
	private AccountRepository() {}
	
	static {
		Account acc1 = new Account(123, 150.50, "Robert Anderson");
		Account acc2 = new Account(124, 112.50, "Tim Johnson");
		Account acc3 = new Account(125, 10.00, "Ana Madrugo");
		Account acc4 = new Account(126, 1111.98, "Noman Ghous");
		accountMap.put(acc1.getCustID(), acc1);
		accountMap.put(acc2.getCustID(), acc2);
		accountMap.put(acc3.getCustID(), acc3);
		accountMap.put(acc4.getCustID(), acc4);
		
	}
	
	public Map<Integer, Account> getList()
	{
		return accountMap;
	}
	
	public static AccountRepository getObject()
	{
		return ACCOUNT_REPOSITORY;
	}
	
}
