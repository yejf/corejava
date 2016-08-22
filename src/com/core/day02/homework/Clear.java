/**
 * 本代码归xx公司版权所有
 */
package com.core.day02.homework;

import java.util.Scanner;

/**
 * @author 陈一凡
 *
 */
public class Clear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int i = sc.nextInt();
		String iBin = Integer.toBinaryString(i);
		System.out.println(i + "的二进制为：" + iBin);
		System.out.println("请选择要清零的位数：");
		int n = sc.nextInt();
		int mask = -(int) Math.pow(2, n - 1) - 1;
		int j = i & mask;
		String jBin = Integer.toBinaryString(j);
		System.out.println(i + "的第" + n + "位数清零为：" + j);
		System.out.println(j + "的二进制为：" + jBin);
		sc.close();
	}
}