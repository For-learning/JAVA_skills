package com.cll.runnable.pro_con_02;

import java.util.concurrent.locks.*;

public class Resource {
	// ����һ��������,ReentrantLock��һ��������
	Lock lock = new ReentrantLock();
	// ͨ�����е������������������һ����������ߣ�һ����������ߡ�
	Condition pro_con = lock.newCondition();
	Condition con_con = lock.newCondition();

	private String name;
	private int count = 1;
	private boolean flag = false;

	public void set(String name) {
		// ������Դ��
		lock.lock();
		try {
			while (flag)
				try {
					pro_con.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			this.name = name + count;
			count++;
			System.out.println(Thread.currentThread().getName() + "...������..."
					+ this.name);
			flag = true;
			// �ͷ�ִ��Ȩ������������һ���߳�
			con_con.signal();
		} finally {
			lock.unlock();
		}
	}

	public void out() {
		lock.lock();
		try {
			while (!flag)
				try {
					con_con.await();
				} catch (InterruptedException e) {
				}
			System.out.println(Thread.currentThread().getName()
					+ "........������........." + this.name);
			flag = false;
			pro_con.signal();
		} finally {
			lock.unlock();
		}
	}
}
