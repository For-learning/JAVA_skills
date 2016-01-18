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
		 * 1�������ı��ļ��� 1.1 ʹ���ַ��� 1.2 ʹ���ֽ���
		 * 
		 * 2�����������ļ���mp3��avi�ȣ� 1.1 ʹ���ֽ���
		 * 
		 * 
		 * ������ʽ�� 1.���ֽڻ��ַ���ȡ�� 2.�Զ��建������ʽ��ȡ���Ƽ���Ч�ʸߣ���
		 */

		fsAndOs_5();
	}

	/**
	 * �ı��ļ����ֽ�����ʽ��ȡ
	 * 
	 * @throws Exception
	 */
	public static void fsAndOs_1() throws Exception {

		InputStream fs = new FileInputStream("123.txt");
		OutputStream os = new FileOutputStream("456.txt");

		String str = null;

		int temp = 0;
		while ((temp = fs.read()) != -1) {
			// ��ӡ���
			str += (char) temp;
			// ������ļ�
			os.write(temp);
		}
		os.flush();

		fs.close();
		os.close();

		System.out.println(str);
	}

	/**
	 * �ı��ļ����ַ�����ʽ��ȡ
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
			// ��ӡ���
			str += (char) temp;
			// ������ļ�
			ow.write(temp);
		}
		ow.flush();
		ir.close();
		ow.close();

		System.out.println(str);

	}

	/**
	 * ���������ļ���mp3��avi�ȣ�
	 * 
	 * @throws Exception
	 * 
	 */
	public static void fsAndOs_3() throws Exception {
		/**
		 * ���������ļ���mp3��avi�ȣ������һ����ʹ���ֽ�������û��ʹ���ַ��������������fsAndOs_1һ����
		 * */
	}

	/**
	 * ������ʽ�� 1.���ֽڻ��ַ���ȡ��
	 * 
	 * @throws Exception
	 * 
	 */
	public static void fsAndOs_4() throws Exception {
		/**
		 * ���ϵ�ʵ����fsAndOs_1��fsAndOs_2��fsAndOs_3�������ǵ��ֽڻ��ַ�������ʽ��
		 * */
	}

	/**
	 * ������ʽ��2.�Զ��建������ʽ��ȡ���Ƽ���Ч�ʸߣ���
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
