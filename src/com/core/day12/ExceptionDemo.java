/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day12;

import java.util.Scanner;

/**
 * @author yejf
 *
 */
public class ExceptionDemo {

	public int divide(int a, int b) throws Exception {
		//
		//������������������ RuntimeException
		if(b == 0) {
			//System.out.println("��ĸ����Ϊ0");
			//�����׳��쳣
			throw new Exception("��ĸΪ0");
		}
		
		int result = a / b;
		return result;
	}
	
	public static void main(String[] args) {
		ExceptionDemo demo = new ExceptionDemo();
		try {
			int r = 0;
			
//			int i = inputInt("������һ������>");
			int i = inputInt2("������һ������>");
			
			r = demo.divide(10,i);
			System.out.println(r);
			
		} catch (Exception e) {
			e.printStackTrace();
			//��ȡ�쳣����Ϣ
			System.out.println(e.getMessage());
			System.out.println("δ֪�Ľ����");
		} finally {
			System.out.println(">>> ���� finally ...");
		}
	}
	
	/***
	 * �Ӽ��̶���һ������
	 * @return
	 */
	public static int inputInt(String msg) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print(msg);
			int i = sc.nextInt();
			//����
			return i;
		} catch (RuntimeException e) {
//			e.printStackTrace();
			System.out.println("\t���벻ƥ��...");
			return inputInt(msg);
		} finally {
			System.out.println("�ͷ�...");
			//�ͷ�
			sc.close();
		}
		
	}
	
	public static int inputInt2(String msg) {
		Scanner sc = new Scanner(System.in);
		try {
			
			int i = getInt(sc, msg);
			return i;
			
		} finally {
			System.out.println(">>�ͷ�..");
			sc.close();
		}
	}
	
	private static int getInt(Scanner sc, String msg) {
		
		try {
			System.out.println(msg);
			int i = sc.nextInt();
			return i;
		} catch (RuntimeException e) {
			sc.nextLine(); //����һ�ж���
			System.out.printf("\t���벻ƥ��:%s\n",sc.nextLine());
			//Ҫ��sc�еĻ�������
			return getInt(sc, msg);
		}
		
	}
}

