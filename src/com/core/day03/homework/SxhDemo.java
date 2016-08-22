/**
 * 
 */
package com.core.day03.homework;

import java.util.Scanner;

/**
 * @author 顾文
 *
 */
public class SxhDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.printf("输入水仙数的位数：\n");
		int n = sc.nextInt();
		SxhDemo s = new SxhDemo();
		s.printSxh(n);
		sc.close();
	}

	public void printSxh(int n) {
		for (int i = 100; i < Math.pow(10, n); i++) {
			int time = 0;
			for (int k = i; k > 0;) {
				k = k / 10;
				time++;
			}
			int result = 0;
			for (int j = i; j > 0;) {
				result += Math.pow(j % 10, time);
				j = j / 10;
			}
			if (i == result) {
				System.out.printf("%d\n", i);
			}

		}
	}

}
