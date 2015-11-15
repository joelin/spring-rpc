package com.joelin.rpc.spring.rmi;

import com.joelin.rpc.spring.Account;
import com.joelin.rpc.spring.AccountService;

public class AccountRmiClient {
	private AccountService accountService;

	public Account getAccount(String name) {
		return accountService.getAccounts(name);
	}

	public void addAcount(Account account) {
		accountService.insertAccount(account);
	}

	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}

}
