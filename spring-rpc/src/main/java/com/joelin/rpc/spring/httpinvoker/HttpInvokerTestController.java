package com.joelin.rpc.spring.httpinvoker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.joelin.rpc.spring.Account;

@Controller
public class HttpInvokerTestController {
	@Autowired
	private AccountHttpInvokerClient client;


	@RequestMapping(value="/user/httpinvoker/addUser/{name}",method=RequestMethod.POST)
	@ResponseBody
	public String addUser(@PathVariable String name) {
		Account a = new Account();
		a.setName(name);
		client.addAcount(a);
		return "add user is ok";
	}
	
	@RequestMapping(value="user/httpinvoker/query/{name}",method=RequestMethod.POST)
	@ResponseBody
	public String queryUser(@PathVariable String name) {
		client.getAccount(name);
		return "get user is ok";
	}
}
