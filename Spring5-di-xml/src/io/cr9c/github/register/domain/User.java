package io.cr9c.github.register.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
	private Long id;
	private String name;
	private int age;
}
