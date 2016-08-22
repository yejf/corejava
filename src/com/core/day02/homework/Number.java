/**
 * 本代码归xx公司版权所有
 */
package com.core.day02.homework;

import java.util.Scanner;

/**
 * @author 陈一凡
 *
 */
public class Number {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入行数：");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
