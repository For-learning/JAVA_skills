package com.cll.runnable.thread;

public class Thread01 extends Thread {

	private Resource r;

	public Thread01(Resource r) {
		this.r = r;
	}

	@Override
	public void run() {
		synchronized (r) {
			while (true) {
				if (r.flag) {
					try {
						this.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				r.name = "资源";
				r.age = 6;
				r.flag = true;
				System.out.println("已输入资源");
				this.notify();
			}

		}
	}
}
