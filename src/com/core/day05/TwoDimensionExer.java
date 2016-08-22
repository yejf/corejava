/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day05;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author yejf
 *
 */
public class TwoDimensionExer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入层次>");
		int level = sc.nextInt();
		//
		TwoDimensionExer tde = new TwoDimensionExer();
		int[][] yh = tde.yhTriangle(level);
		//
		for (int i = 0; i < yh.length; i++) {
			System.out.printf("%s\n",Arrays.toString(yh[i]));
		}
		//
		sc.close();
	}

	/*****
	 * 利用二维数组来存放指定层次的杨辉三角 数据 杨辉三角 规则如下： A).任意行的第1列和最后1列都是1
	 * B).除此之外的其它值是上一行的同列和前一列之和。
	 * 
	 * @param level
	 * @return
	 */
	public int[][] yhTriangle(int level) {
		// 定义一个二维数组
		int[][] yh = new int[level][];
		// 算法
		for (int i = 0; i < yh.length; i++) {
			// 进一步初始化它的元素
			yh[i] = new int[i + 1];
			// 内层循环
			for (int j = 0; j < yh[i].length; j++) {
				// 根据杨辉三角的规则来确定元素值。
				// 任意行的第1列和最后1列都是1
				if (j == 0 || j == i) {
					yh[i][j] = 1;
				} else {
					yh[i][j] = yh[i - 1][j] + yh[i - 1][j - 1];
				}
			}
		}
		// 返回
		return yh;
	}

}
