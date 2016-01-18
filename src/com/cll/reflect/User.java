package com.cll.reflect;

public class User {

	// 无参数构造方法
	public User() {
	}

	// 有参数构造方法
	public User(int id, String name, String age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	private int id;
	private String name;
	private String age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	// 其他方法
	public void showName() {
		System.out.println("我的名字加User");
	}

}
