package com.cll.runnable.thread;

public class Main {

	public static void main(String[] args) {
		// 实例化资源
		Resource r = new Resource();

		// 创建实现runable接口的资源控制器
		Thread01 t01 = new Thread01(r);
		Thread02 t02 = new Thread02(r);

		// 开启线程运行
		t01.start();
		t02.start();
	}

}
