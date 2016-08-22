/**
 * 本代码归XXX公司所有，未经许可，不得转发，复制。
 */
package com.core.day04.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author 王抄
 *
 */
public class DoubleColorBalls {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DoubleColorBalls dcb = new DoubleColorBalls();
		System.out.println("请输入需要投注双色球的注数");
		int n = sc.nextInt();
		dcb.printBall(n);
		sc.close();
	}

	/**
	 * 产生一注双色球
	 * 
	 * @return
	 */
	public int[] doubleColorBall() {
		Random r = new Random();
		int[] scb = new int[7];
		for (int i = 0; i <= 6; i++) {
			if (i <= 5) {
				scb[i] = r.nextInt(33) + 1;
				boolean b = true;
				for (int j = 0; j < i; j++) {
					b = (b && (scb[i] != scb[j]));
				}
				if (b == false) {
					i--;
				}
			} else {
				scb[i] = r.nextInt(16) + 1;
			}
		}
		return scb;

	}

	/**
	 * 打印输出n注双色球
	 * 
	 * @param n
	 */
	public void printBall(int n) {
		// 循环n次，调用 doubleColorBall();

		for (int i = 1; i <= n; i++) {
			int[] scb = doubleColorBall();
			for (int j = 0; j <= 4; j++) {
				for (int k = j + 1; k <= 5; k++) {
					int c = 0;
					if (scb[j] > scb[k]) {
						c = scb[j];
						scb[j] = scb[k];
						scb[k] = c;
					}
				}
			}
			System.out.printf("第%-4d注双色球是：%s\n", i, Arrays.toString(scb));
		}
	}

}
