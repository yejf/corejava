/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day01;

import java.util.Scanner;

/**
 * @author yejf
 *
 */
public class ImportDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// ��ʾ�û�������������
		System.out.println("�������������>");
		// ��������������û�������
		String name = sc.next();
		// ����ʾ�û���������
		System.out.println("\n\t�������>");
		// ��������������û�������
		int age = sc.nextInt();
		// ��ӡ�����������������ֵ
		System.out.println("Hi," + name + ",��" + age + "����.");
		// �ͷ���Դ
		sc.close();
	}

}

