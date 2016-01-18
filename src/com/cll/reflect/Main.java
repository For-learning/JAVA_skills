package com.cll.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws Exception {
		/**
		 * java反射机制就是在运行状态中，对于任意一个类（class文件），都知道这个类的所有属性和方法。 反射的简单运行过程：
		 * 1、首先应该有一个编译成二进制字节码的文件；
		 * 2、我们通过这个类的全类名找到这个类文件并加载进内存，创建该字节码文件对象，并创建该字节码文件对应的对象
		 * （Class.forName()）； 3、这样我们就可以通过反射提供的方法来实例化这个类，并却得其方法和属性并执行。
		 * */
		try {
			// 通过二进制字节码文件加载类（需要知道类的全限定名）
			Class clazz = Class.forName("com.cll.reflect.User");

			// 得到类的所有方法
			Method[] ms = clazz.getDeclaredMethods();// clazz.getMethods()
			for (Method m : ms) {
				System.out.println(m);
			}

			// 得到类的全部属性
			Field[] fs = clazz.getDeclaredFields(); // clazz.getFields()
			for (Field f : fs) {
				System.out.println(f);
			}

			// 通过无参构造实例化该类
			// Object obj = clazz.newInstance();
			// 根据参数构造器实例化该类
			Constructor conn = clazz.getConstructor(int.class, String.class,
					String.class);
			Object obj = conn.newInstance(1, "xiaoming", "5岁");

			// 实例化的类就可以执行了
			Method m = clazz.getDeclaredMethod("showName");
			m.invoke(obj, null);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
