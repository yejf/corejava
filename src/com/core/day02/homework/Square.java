/**
 * �������xx��˾��Ȩ����
 */
package com.core.day02.homework;

import java.util.Scanner;

/**
 * @author ��һ��
 *
 */
public class Square {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������εĳ���");
		int l = sc.nextInt();
		System.out.println("��������εĸߣ�");
		int h = sc.nextInt();
		for (int m = 1; m <= h; m++) {
			for (int n = 1; n <= l; n++) {
				if ((n == 1) || (n == l) || (m == 1) || (m == h)) {
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
