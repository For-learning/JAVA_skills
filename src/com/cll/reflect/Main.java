package com.cll.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws Exception {
		/**
		 * java������ƾ���������״̬�У���������һ���ࣨclass�ļ�������֪���������������Ժͷ����� ����ļ����й��̣�
		 * 1������Ӧ����һ������ɶ������ֽ�����ļ���
		 * 2������ͨ��������ȫ�����ҵ�������ļ������ؽ��ڴ棬�������ֽ����ļ����󣬲��������ֽ����ļ���Ӧ�Ķ���
		 * ��Class.forName()���� 3���������ǾͿ���ͨ�������ṩ�ķ�����ʵ��������࣬��ȴ���䷽�������Բ�ִ�С�
		 * */
		try {
			// ͨ���������ֽ����ļ������ࣨ��Ҫ֪�����ȫ�޶�����
			Class clazz = Class.forName("com.cll.reflect.User");

			// �õ�������з���
			Method[] ms = clazz.getDeclaredMethods();// clazz.getMethods()
			for (Method m : ms) {
				System.out.println(m);
			}

			// �õ����ȫ������
			Field[] fs = clazz.getDeclaredFields(); // clazz.getFields()
			for (Field f : fs) {
				System.out.println(f);
			}

			// ͨ���޲ι���ʵ��������
			// Object obj = clazz.newInstance();
			// ���ݲ���������ʵ��������
			Constructor conn = clazz.getConstructor(int.class, String.class,
					String.class);
			Object obj = conn.newInstance(1, "xiaoming", "5��");

			// ʵ��������Ϳ���ִ����
			Method m = clazz.getDeclaredMethod("showName");
			m.invoke(obj, null);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
