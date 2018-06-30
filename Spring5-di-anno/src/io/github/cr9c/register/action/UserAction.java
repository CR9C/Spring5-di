package io.github.cr9c.register.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import io.github.cr9c.register.damain.User;
import io.github.cr9c.register.service.IUserService;


//模拟Struts2的Action/SpringMVC的Controller
@Controller
@Scope("prototype")
public class UserAction {

	@Autowired
	private IUserService service;

	public String execute() {
		System.out.println("注册请求");
		service.register(new User());
		return "success";
	}
}
