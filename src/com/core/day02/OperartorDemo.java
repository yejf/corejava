/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day02;

/**
 * @author yejf
 *
 */
public class OperartorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'A';
		char c2 = 'a';
		
		int i1 = c1;
		int i2 = c2; //隐式转换
		
		System.out.println("i1 = "+i1);
		System.out.println("i2 = "+i2);
		
		i1 += 2;
		i2++;
		
		c1 = (char)i1; //强制转换
		c2 = (char)i2;
		
		System.out.println("c1 = "+c1);
		System.out.println("c2 = "+c2);
	}

}
