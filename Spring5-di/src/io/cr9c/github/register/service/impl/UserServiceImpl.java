package io.cr9c.github.register.service.impl;

import io.cr9c.github.register.dao.IUserDAO;
import io.cr9c.github.register.domain.User;
import io.cr9c.github.register.service.IUserService;
import lombok.Setter;

public class UserServiceImpl implements IUserService {

	@Setter
	private IUserDAO dao;

	public void register(User user) {
		System.out.println("注册操作");
		dao.save(user);
	}

}
