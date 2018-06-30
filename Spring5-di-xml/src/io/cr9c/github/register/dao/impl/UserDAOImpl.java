package io.cr9c.github.register.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import io.cr9c.github.register.dao.IUserDAO;
import io.cr9c.github.register.domain.User;
import lombok.Cleanup;
import lombok.Setter;
import lombok.SneakyThrows;

public class UserDAOImpl implements IUserDAO {

	@Setter
	private DataSource dataSource;//注解不可用,用手动set方法


	@SneakyThrows
	public void save(User u){
		System.out.println("保存操作");
		@Cleanup
		Connection conn = dataSource.getConnection();
		String sql = "INSERT INTO user(name,age) VALUES(?,?)";
		@Cleanup
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1,u.getName());
		ps.setInt(2, u.getAge());
		ps.executeUpdate();
	}
}
