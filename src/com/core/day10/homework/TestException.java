/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day10.homework;

import java.util.Scanner;

/**
 * @author yejf
 *
 */
public class TestException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个整数>");
		
		try {
			int i = sc.nextInt();
			
			System.out.println("你输入了: "+i);
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("你输错了");
			System.out.println("原因："+e.getMessage());
			System.out.println("异常堆栈：");
			e.printStackTrace();
		}
		
		sc.close();
	}

}

