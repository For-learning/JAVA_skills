package com.cll.runnable.connection;

public class Resource {
	private String name;
	private String sex;
	private boolean flag = false;

	public synchronized void set(String name, String sex) {
		if (flag)
			try {
				this.wait();
			} catch (InterruptedException e) {
			}
		if (!flag) {
			this.name = name;
			this.sex = sex;
			flag = true;
		}
		this.notify();
	}

	public synchronized void out() {
		if (!flag)
			try {
				this.wait();
			} catch (InterruptedException e) {
			}
		System.out.println(name + ".........." + sex);
		flag = false;
		this.notify();
	}
}
