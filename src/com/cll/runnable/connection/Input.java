package com.cll.runnable.connection;

public class Input implements Runnable {
	Resource r;

	Input(Resource r) {
		this.r = r;
	}

	@Override
	public void run() {
		int x = 0;
		while (true) {
			if (x == 0) {
				r.set("mike", "nan");
			} else {
				r.set("ÀöÀö", "Å®Å®Å®");
			}
			x = (x + 1) % 2;
		}
	}

}
