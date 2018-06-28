package io.cr9c.github.register.service;

import io.cr9c.github.register.domain.User;

public interface IUserService {
	
	void register(User user) throws Exception;
}
