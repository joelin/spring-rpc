package com.joelin.rpc.spring;


public interface AccountService  {
	
	public void insertAccount(Account account);
	public Account getAccounts(String name);

}
