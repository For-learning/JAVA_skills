package com.cll.runnable.pro_con_01;

public class Main {

	public static void main(String[] args) {
		Resource r = new Resource();
		Produce pro = new Produce(r);
		Consumer con = new Consumer(r);
		Thread t1 = new Thread(pro);
		Thread t2 = new Thread(pro);
		Thread t3 = new Thread(con);
		Thread t4 = new Thread(con);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
