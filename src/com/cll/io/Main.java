package com.cll.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		/*
		 * 1、操作文本文件。 1.1 使用字符流 1.2 使用字节流
		 * 
		 * 2、操作其他文件（mp3，avi等） 1.1 使用字节流
		 * 
		 * 
		 * 操作方式， 1.单字节或单字符读取。 2.自定义缓冲区方式读取（推荐，效率高）。
		 */

		fsAndOs_5();
	}

	/**
	 * 文本文件，字节流方式读取
	 * 
	 * @throws Exception
	 */
	public static void fsAndOs_1() throws Exception {

		InputStream fs = new FileInputStream("123.txt");
		OutputStream os = new FileOutputStream("456.txt");

		String str = null;

		int temp = 0;
		while ((temp = fs.read()) != -1) {
			// 打印输出
			str += (char) temp;
			// 输出到文件
			os.write(temp);
		}
		os.flush();

		fs.close();
		os.close();

		System.out.println(str);
	}

	/**
	 * 文本文件，字符流方式读取
	 * 
	 * @throws Exception
	 * 
	 */
	public static void fsAndOs_2() throws Exception {
		InputStreamReader ir = new FileReader("123.txt");
		OutputStreamWriter ow = new FileWriter("456.txt");

		String str = null;

		int temp = 0;
		while ((temp = ir.read()) != -1) {
			// 打印输出
			str += (char) temp;
			// 输出到文件
			ow.write(temp);
		}
		ow.flush();
		ir.close();
		ow.close();

		System.out.println(str);

	}

	/**
	 * 操作其他文件（mp3，avi等）
	 * 
	 * @throws Exception
	 * 
	 */
	public static void fsAndOs_3() throws Exception {
		/**
		 * 操作其他文件（mp3，avi等），这个一般是使用字节流，而没法使用字符流，这个方法和fsAndOs_1一样。
		 * */
	}

	/**
	 * 操作方式， 1.单字节或单字符读取。
	 * 
	 * @throws Exception
	 * 
	 */
	public static void fsAndOs_4() throws Exception {
		/**
		 * 以上的实例（fsAndOs_1，fsAndOs_2，fsAndOs_3），都是单字节或单字符操作方式。
		 * */
	}

	/**
	 * 操作方式，2.自定义缓冲区方式读取（推荐，效率高）。
	 * 
	 * @throws Exception
	 * 
	 */
	public static void fsAndOs_5() throws Exception {
		InputStream fs = new FileInputStream("123.txt");
		OutputStream os = new FileOutputStream("456.txt");

		byte[] charTemp = new byte[10];

		int temp = 0;
		while ((temp = fs.read(charTemp)) != -1) {
			System.out.println(temp);
			os.write(charTemp, 0, temp);
		}

		os.flush();
		fs.close();
		os.close();
	}
}
