package com.joelin.rpc.spring.rmi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.joelin.rpc.spring.Account;

@Controller
public class RmiTestController {
	@Autowired
	private AccountRmiClient client;
	
	@RequestMapping(value="user/rmi/addUser/{name}")
	@ResponseBody
	public String addUser(@PathVariable String name) {
		Account a = new Account();
		a.setName(name);
		client.addAcount(a);
		return "add user is ok";
	}
	
	@RequestMapping(value="user/rmi/query/{name}")
	@ResponseBody
	public String queryUser(@PathVariable String name) {
		client.getAccount(name);
		return "get user is ok";
	}
}
