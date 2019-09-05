package com.lloydsbanking.webproject.poc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.lloydsbanking.webproject.poc.account.Account;
import com.lloydsbanking.webproject.poc.account.AccountDAO;
import com.lloydsbanking.webproject.poc.account.AccountRepository;


public class TestForAccountDAO {

	// getting singleton objects of classes
	private AccountDAO accountDAO = AccountDAO.getObject();
	private AccountRepository accountRepo = AccountRepository.getObject();
	
	@Test
	public void testDeductMehod() 
	{
		Account account = accountRepo.getList().get(123);
		double result = accountDAO.addBalance(account, 0.50);
		assertEquals("Account balance was not correct.",151.0, result, 0);
	}
	
	@Test
	public void testAddMehod() 
	{
		Account account = accountRepo.getList().get(124);
		double result = accountDAO.deductBalance(account, 1);
		assertEquals("Account balance was not correct.", 111.50, result, 0);
	
	}

}
