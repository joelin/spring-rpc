package com.joelin.rpc.spring;


public class AccountServiceImpl implements AccountService{

	public void insertAccount(Account account) {
		System.out.println(String.format("insert account for name %s",account==null?"":account.getName() ));
	}

	public Account getAccounts(String name) {
		System.out.println(String.format("get account for name %s",name));
		return null;
	}

	
}
