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
public class ToRandomNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入需要产生随机数的个数>");
		int length = sc.nextInt();
		System.out.println("\t范围>");
		int n = sc.nextInt();
		
		ToRandomNumber trn = new ToRandomNumber();
//		trn.toRandomNebber(length);
		int[] result = trn.randomCount(length, n);
		//
		for (int i = 0; i < result.length; i++) {
			System.out.printf("数字%d出现了:%d次\n",i+1,result[i]);
		}
		sc.close();
	}

	/**
	 * 产生随机数
	 * 
	 * @param length输入随机数的长度
	 * @return返回length长度的随机数的数组
	 */
	public void toRandomNebber(int length) {
		Random sr = new Random();
		int[] r = new int[length];
		for (int i = 0; i < r.length; i++) {
			r[i] = sr.nextInt(50) + 1;
		}
		this.judgeIntString(r);
	}
	
	/***
	 * 统计生成times次1~max之间的随机数各自出现的次数
	 * @param times 随机数的个数
	 * @param max	随机数的上限
	 * @return
	 */
	public int[] randomCount(int times,int max){
		Random r = new Random();
		int[] arr = new int[max];
		//循环给此数组填充
		for(int i=0;i<times;i++){
			int t = r.nextInt(max)+1;
			//这个t与数组下标之间的关系是：下标=t-1
			arr[t-1]++;
		}
		return arr;
	}

	/**
	 * 判断传入数组中相同元素的个数
	 * 
	 * @param r输入的数组
	 */
	public void judgeIntString(int[] r) {
		for (int i = 1; i <= 50; i++) {
			int count = 0;
			for (int j = 0; j < r.length; j++) {
				if (i == r[j])
					count++;
			}
			System.out.printf("%-2d:出现的次数为%d:\n", i, count);
		}
	}

}
