/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day10;

/**
 * @author yejf
 *
 */
public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//利用串池的方式来给字符串对象赋值
		String s1 = "hehe";
		String s2 = "hehe";
		
		System.out.println(s1 == s2);
		
		//使用普通的方式来创建字符串
		String a1 = new String("jack");
		String a2 = new String("jack");
		
		System.out.println(a1 == a2);
		
		//把常规创建的字符串以串池的方式进行存储
		String a3 = a1.intern();
		String a4 = a2.intern();
		
		System.out.println(a3 == a4);
	}

}
