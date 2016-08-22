/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day06;

import java.util.Arrays;

/**
 * 本案例演示参数传递的规则
 * @author yejf
 *
 */
public class ParameterTransferDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 100;
		add(n);
		System.out.printf("n = %d\n",n);
		//
		int[] arr = new int[]{1,2,3};
		System.out.printf("自增前：%s\n",Arrays.toString(arr));
		add(arr);
		System.out.printf("自增后：%s\n",Arrays.toString(arr));
	}
	
	/****
	 * 基本类型的参数传递的是值本身
	 * @param a
	 */
	public static void add(int a){
		a++;
	}
	
	/***
	 * 对象类型传递的是引用/地址
	 * @param a
	 */
	public static void add(int[] a){
		for (int i = 0; i < a.length; i++) {
			a[i]++;
		}
	}
}
