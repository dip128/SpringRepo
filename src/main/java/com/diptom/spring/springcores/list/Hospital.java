package com.diptom.spring.springcores.list;

import java.util.List;

public class Hospital {
	String name;
	private List<String> dept;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getDept() {
		return dept;
	}

	public void setDept(List<String> dept) {
		this.dept = dept;
	}
}
