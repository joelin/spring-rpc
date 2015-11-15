package com.joelin.rpc.spring.httpinvoker;

import com.joelin.rpc.spring.Account;
import com.joelin.rpc.spring.AccountService;

public class AccountHttpInvokerClient {
	private AccountService accountService;

	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
	
	public Account getAccount(String name) {
		return accountService.getAccounts(name);
	}

	public void addAcount(Account account) {
		accountService.insertAccount(account);
	}
}
