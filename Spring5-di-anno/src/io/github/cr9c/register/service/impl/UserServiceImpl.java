package io.github.cr9c.register.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.cr9c.register.damain.User;
import io.github.cr9c.register.dao.IUserDAO;
import io.github.cr9c.register.service.IUserService;


@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDAO dao;

	public void register(User user) {
		System.out.println("注册操作");
		dao.save(user);
	}

}
