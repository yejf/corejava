/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day10;

import java.math.BigInteger;

/**
 * @author yejf
 *
 */
public class BigIntegerDemo {

	/***********
	 * 利用大整数类型计算出任意整数的阶乘
	 * 
	 * @param n
	 * @return
	 */
	public BigInteger factor(int n) {
		//做条件判断
		if(n == 1){
			return BigInteger.ONE;
		}
		//把基本类型n转换成BigInteger类型
		BigInteger bi = BigInteger.valueOf(n);
		//递归调用
		return bi.multiply(factor(n - 1));
	}
	
	public static void main(String[] args) {
		int i = 100;
		//
		BigIntegerDemo bd = new BigIntegerDemo();
		BigInteger bi = bd.factor(i);
		//
		System.out.printf("%d的阶乘：\n%s\n",i, bi.toString());
	}
}
