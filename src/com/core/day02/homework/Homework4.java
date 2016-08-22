/**
 * 本代码归XXX公司所有，未经许可，不得转发，复制。
 */
package com.core.day02.homework;

import java.util.Scanner;

/**
 * @author 王抄
 *
 */
public class Homework4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 0;
		int p = 0;
		int q = 0;
		for (int i = 1; i <= 15; i++) {
			switch (i) {
			case 1:
			case 2:
			case 3:
			case 4:
				for (int j = 1; j <= (int) Math.pow(2, 3 - i); j++) {
					System.out.print(" ");
				}
				int m = 1;
				for (; m <= k + 5 - (i - 1); m++) {
					System.out.print("*");
				}
				p = k;
				k = m - 1;
				for (int j = 1; j <= 9 - (i - 1) * 4; j++) {
					System.out.print(" ");
				}
				if (i == 4) {
					p -= 1;
				}
				for (int j = 1; j <= p + 5 - (i - 1); j++) {
					System.out.print("*");
				}
				System.out.println();
				break;
			case 5:
				for (int j = 1; j <= 27; j++) {
					System.out.print("*");
				}
				System.out.println();
				break;
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				for (int j = 1; j <= i - 6; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= (27 - (i - 6) * 2); j++) {
					System.out.print("*");
				}
				System.out.println();
				break;
			case 11:
			case 12:
			case 13:
			case 14:
				int j = 1;
				for (; j <= 4 + (i - 10) * 2; j++) {
					System.out.print(" ");
				}
				for (int n = 1; n <= (19 - (i - 10) * 4); n++) {
					System.out.print("*");
				}
				System.out.println();
				q = j - 1;
				break;
			case 15:
				for (int j_1 = 1; j_1 <= q + 1; j_1++) {
					System.out.print(" ");
				}
				System.out.print("*");

			}
		}

	}

}
