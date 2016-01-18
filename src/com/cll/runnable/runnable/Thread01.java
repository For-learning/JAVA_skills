package com.cll.runnable.runnable;

public class Thread01 implements Runnable {

	private Resource r;

	public Thread01(Resource r) {
		this.r = r;
	}

	@Override
	public void run() {
		r.name = "name01";
		r.age = 1;
		System.out.println(r.toString());
	}

}
