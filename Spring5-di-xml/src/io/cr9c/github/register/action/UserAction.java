package io.cr9c.github.register.action;

import io.cr9c.github.register.domain.User;
import io.cr9c.github.register.service.IUserService;
import lombok.Setter;

//模拟Struts2的Action/SpringMVC的Controller
public class UserAction {

	@Setter
	private IUserService service;

	public String execute() throws Exception {
		System.out.println("注册请求");
		service.register(new User());
		return "success";
	}
}
