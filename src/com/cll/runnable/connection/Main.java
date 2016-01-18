package com.cll.runnable.connection;

public class Main {

	public static void main(String[] args) {
		Resource source = new Resource();
		Input in = new Input(source);
		Output out = new Output(source);
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		t1.start();
		t2.start();
	}

}
