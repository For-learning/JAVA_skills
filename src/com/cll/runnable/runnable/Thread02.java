package com.cll.runnable.runnable;

public class Thread02 implements Runnable {

	private Resource r;

	public Thread02(Resource r) {
		this.r = r;
	}

	@Override
	public void run() {
		r.name = "name02";
		r.age = 2;
		System.out.println(r.toString());
	}

}
