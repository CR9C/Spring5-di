package io.github.cr9c.register;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import io.github.cr9c.register.action.UserAction;

@SpringJUnitConfig
public class App {

	@Autowired
	private UserAction action;

	@Test
	void test() throws Exception {
		action.execute();
	}
}
