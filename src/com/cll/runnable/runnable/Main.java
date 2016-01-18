package com.cll.runnable.runnable;

public class Main {

	public static void main(String[] args) {
		// 实例化资源
		Resource r = new Resource();

		// 创建实现runable接口的资源控制器
		Thread01 t01 = new Thread01(r);
		Thread02 t02 = new Thread02(r);

		// 将资源控制器添加到线程
		Thread t1 = new Thread(t01);
		Thread t2 = new Thread(t02);

		// 开启线程运行
		t1.start();
		t2.start();
	}

}
