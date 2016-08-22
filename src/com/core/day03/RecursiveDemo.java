/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day03;

/**
 * @author yejf
 *
 */
public class RecursiveDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RecursiveDemo rd = new RecursiveDemo();
		//调用方法
		int i = 10;
		long result = rd.factor(i);
		//
		System.out.println(i+"的阶乘是："+result);
		
	}
	
	/******
	 * 采用递归算法计算出指定整数的阶乘
	 * @param n
	 * @return
	 */
	public long factor(int n){
		System.out.println("正在计算"+n+"的阶乘...");
		//1. 指定退出条件
		if(n == 1){
			System.out.println("\t返回1的阶乘...");
			return 1L;
		}
		//2. 找出规律，递归调用
		long r = n * factor(n - 1);
		System.out.println("\t即将返回"+n+"的阶乘："+r);
		return r;
	}

}


