/**
 * 本代码归XXX公司所有，未经许可，不得转发，复制。
 */
package com.core.day04.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 王抄
 *
 */
public class CircleDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CircleDemo cd = new CircleDemo();
		System.out.println("请输入小孩的个数和报的最大数");
		int m = sc.nextInt();
		int n = sc.nextInt();
		cd.circleMethod(m, n);
		sc.close();
	}

	public void circleMethod(int m, int n) {
		int[] circle = new int[m];// 存放m个人
		int[] result = new int[m];// 记录退出顺序
		int k = 0;

		// 给数组中每一个数赋值1
		for (int i = 0; i < circle.length; i++) {
			circle[i] = 1;
		}

		System.out.printf("%s\n", Arrays.toString(circle));

		int times = 0;

		for (int i = 0; m > 0;) {
			if (circle[i] == 1) {
				times++;
				if (times == n) {
					result[k++] = i + 1;
					circle[i] = 0;
					times = 0;
					m--;
				}
				i++;
			} else {
				i++;
			}
			if (i >= circle.length) {
				i %= circle.length;
			}
		}
		System.out.printf("\n退出顺序为：%s", Arrays.toString(result));

	}

}
