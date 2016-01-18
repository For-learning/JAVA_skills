package com.cll.runnable.thread;

public class Thread02 extends Thread {

	private Resource r;

	public Thread02(Resource r) {
		this.r = r;
	}

	@Override
	public void run() {
		synchronized (r) {
			while (true) {
				if (!r.flag) {
					try {
						this.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(r.toString());
				r.flag = false;
				this.notify();
			}

		}

	}

}
