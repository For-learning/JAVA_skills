package com.cll.reflect;

public class User {

	// �޲������췽��
	public User() {
	}

	// �в������췽��
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

	// ��������
	public void showName() {
		System.out.println("�ҵ����ּ�User");
	}

}
