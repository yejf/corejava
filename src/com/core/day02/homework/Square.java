/**
 * 本代码归xx公司版权所有
 */
package com.core.day02.homework;

import java.util.Scanner;

/**
 * @author 陈一凡
 *
 */
public class Square {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入矩形的长：");
		int l = sc.nextInt();
		System.out.println("请输入矩形的高：");
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
