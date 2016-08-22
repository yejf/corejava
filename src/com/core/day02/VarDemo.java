/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day02;

/**
 * @author yejf
 *
 */
public class VarDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义变量
		String msg = "Hello,Java!";
		//输出此变量的值
		System.out.println(msg);
		
		//
		int i = 18;
		long a = 100L;
		short s = 19;
		byte b = 12;
		//输出以上4上个变量的值
		System.out.println("i = "+i);
		System.out.println("a = "+a);
		System.out.println("s = "+s);
		System.out.println("b = "+b);
		
		//
		double d = 45.67;
		float f = 34.56F; 
		System.out.println("d = "+d);
		System.out.println("f = "+f);
		
		//
		boolean bn = true;
		System.out.println("bn = "+bn);
		
		//定义字符变量
		char c1 = '男';
		System.out.println("c1 = "+c1);
		char c2 = '\t';
		System.out.println(c2+"=>"+c1);
		char c3 = '\u6211';
		System.out.println("c3 = "+c3);
		
		//定义常量
		final int EAST = 1;
		final int WEST = 2;
		final int NORTH = 3;
		final int SOUTH = 4;
		
		
	}

}
