package com.cll.runnable.pro_con_01;

public class Resource {
	private String name;
	private int count = 1;
	private boolean flag = false;

	public synchronized void set(String name) {
		while (flag)
			try {
				this.wait();
			} catch (InterruptedException e) {
			}
		this.name = name + count;
		count++;
		System.out.println(Thread.currentThread().getName() + "...������..."
				+ this.name);
		flag = true;
		notifyAll();// �������еĽ��̡�
	}

	public synchronized void out() {
		while (!flag)
			try {
				this.wait();
			} catch (InterruptedException e) {
			}
		System.out.println(Thread.currentThread().getName()
				+ "........������........." + this.name);
		flag = false;
		notifyAll();
	}
}
