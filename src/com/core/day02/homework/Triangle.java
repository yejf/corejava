/**
 * �������xx��˾��Ȩ����
 */
package com.core.day02.homework;

import java.util.Scanner;

/**
 * @author ��һ��
 *
 */
public class Triangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ֱ�������εĸ߶ȣ�");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}