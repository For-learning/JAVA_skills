package com.cll.runnable.pro_con_02;

import java.util.concurrent.locks.*;

public class Resource {
	// 创建一个锁对象,ReentrantLock是一个互斥锁
	Lock lock = new ReentrantLock();
	// 通过已有的锁创建两组监视器，一组监视生产者，一组监视消费者。
	Condition pro_con = lock.newCondition();
	Condition con_con = lock.newCondition();

	private String name;
	private int count = 1;
	private boolean flag = false;

	public void set(String name) {
		// 建立资源锁
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
			System.out.println(Thread.currentThread().getName() + "...生产者..."
					+ this.name);
			flag = true;
			// 释放执行权锁，并唤醒另一个线程
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
					+ "........消费者........." + this.name);
			flag = false;
			pro_con.signal();
		} finally {
			lock.unlock();
		}
	}
}
