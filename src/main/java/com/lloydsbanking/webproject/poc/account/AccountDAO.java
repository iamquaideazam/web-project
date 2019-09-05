package com.lloydsbanking.webproject.poc.account;


public class AccountDAO 
{
	
	// Making class singleton
		private static final AccountDAO ACCOUNT_DAO = new AccountDAO();
		
		private AccountDAO() {}
	
	
	public double deductBalance(Account account, double amount)
	{
		account.setBalance(account.getBalance() - amount);
		return account.getBalance();
	}
	public double addBalance(Account account, double amount)
	{
		account.setBalance(account.getBalance() + amount);
		return account.getBalance();
	}
	
	public static AccountDAO getObject()
	{
		return ACCOUNT_DAO;
	}
}
