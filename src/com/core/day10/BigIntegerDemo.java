/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day10;

import java.math.BigInteger;

/**
 * @author yejf
 *
 */
public class BigIntegerDemo {

	/***********
	 * ���ô��������ͼ�������������Ľ׳�
	 * 
	 * @param n
	 * @return
	 */
	public BigInteger factor(int n) {
		//�������ж�
		if(n == 1){
			return BigInteger.ONE;
		}
		//�ѻ�������nת����BigInteger����
		BigInteger bi = BigInteger.valueOf(n);
		//�ݹ����
		return bi.multiply(factor(n - 1));
	}
	
	public static void main(String[] args) {
		int i = 100;
		//
		BigIntegerDemo bd = new BigIntegerDemo();
		BigInteger bi = bd.factor(i);
		//
		System.out.printf("%d�Ľ׳ˣ�\n%s\n",i, bi.toString());
	}
}
