/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day02;

import java.util.Scanner;

/**
 * @author yejf
 *
 */
public class LogicDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//
		System.out.println("请输入任意整数>");
		//定义变量接收 用户的输入
		int i = sc.nextInt();
		//
		System.out.println("\n\t请再输入一个整数>");
		//定义变量接收 用户的输入
		int j = sc.nextInt();
		
		boolean b = i > j;
		
		if(!b){
			System.out.println("\t发生了短路...");
		}
		//做逻辑运算
		b = b && (i % j == 0);
		System.out.println("结果是："+b);
		
		
		//释放资源
		sc.close();
	}

}
