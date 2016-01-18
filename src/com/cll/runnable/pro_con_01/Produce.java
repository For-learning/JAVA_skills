package com.cll.runnable.pro_con_01;

public class Produce implements Runnable {
	
	private Resource r;

	Produce(Resource r) {
		this.r = r;
	}

	@Override
	public void run() {
		while (true) {
			r.set("¿¾Ñ¼");
		}
	}
}
