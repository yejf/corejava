/**
 * �������xx��˾��Ȩ����
 */
package com.core.day02.homework;

import java.util.Scanner;

/**
 * @author ��һ��
 *
 */
public class Clear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��������");
		int i = sc.nextInt();
		String iBin = Integer.toBinaryString(i);
		System.out.println(i + "�Ķ�����Ϊ��" + iBin);
		System.out.println("��ѡ��Ҫ�����λ����");
		int n = sc.nextInt();
		int mask = -(int) Math.pow(2, n - 1) - 1;
		int j = i & mask;
		String jBin = Integer.toBinaryString(j);
		System.out.println(i + "�ĵ�" + n + "λ������Ϊ��" + j);
		System.out.println(j + "�Ķ�����Ϊ��" + jBin);
		sc.close();
	}
}