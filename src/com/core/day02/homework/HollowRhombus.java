/**
 * �������xx��˾��Ȩ����
 */
package com.core.day02.homework;

import java.util.Scanner;

/**
 * @author ��һ��
 *
 */
public class HollowRhombus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ�����ڵ���5��������");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if ((j == n - Math.abs(i - (n + 1) / 2)) 
						|| (j == Math.abs(i - (n + 1) / 2) + 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}