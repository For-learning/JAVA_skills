package com.cll.runnable.thread;

public class Main {

	public static void main(String[] args) {
		// ʵ������Դ
		Resource r = new Resource();

		// ����ʵ��runable�ӿڵ���Դ������
		Thread01 t01 = new Thread01(r);
		Thread02 t02 = new Thread02(r);

		// �����߳�����
		t01.start();
		t02.start();
	}

}
