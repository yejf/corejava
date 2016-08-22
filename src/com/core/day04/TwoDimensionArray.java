/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day04;

/**
 * @author yejf
 *
 */
public class TwoDimensionArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//创建一个规则的二维数组
		int[][] arr = new int[19][19];
		//打印出来
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%-2d",arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("===== 分割线 ======");
		//创建一个不规则的二维数组
		int[][] brr = new int[7][];
		//打印出来
		for (int i = 0; i < brr.length; i++) {
			//进一步初始化二维数组的元素
			brr[i] = new int[i+1];
			for (int j = 0; j < brr[i].length; j++) {
				//赋值
				brr[i][j] = j+1;
				System.out.printf("%-2d",brr[i][j]);
			}
			System.out.println();
		}
	}

}
