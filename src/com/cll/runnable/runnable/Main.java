package com.cll.runnable.runnable;

public class Main {

	public static void main(String[] args) {
		// ʵ������Դ
		Resource r = new Resource();

		// ����ʵ��runable�ӿڵ���Դ������
		Thread01 t01 = new Thread01(r);
		Thread02 t02 = new Thread02(r);

		// ����Դ��������ӵ��߳�
		Thread t1 = new Thread(t01);
		Thread t2 = new Thread(t02);

		// �����߳�����
		t1.start();
		t2.start();
	}

}
