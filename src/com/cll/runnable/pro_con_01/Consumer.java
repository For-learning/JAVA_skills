package com.cll.runnable.pro_con_01;

public class Consumer implements Runnable {

	private Resource r;

	Consumer(Resource r) {
		this.r = r;
	}

	@Override
	public void run() {
		while (true) {
			r.out();
		}
	}
}
