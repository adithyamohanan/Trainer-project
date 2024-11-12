package com.spring.spring_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("sql")
@Scope("prototype")
public class SqlTrainee {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Autowired
	public SqlTrainee(@Value("Bharath") String name) {
		super();
		this.name = name;
	}
}
