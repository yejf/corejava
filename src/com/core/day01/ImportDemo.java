/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day01;

import java.util.Scanner;

/**
 * @author yejf
 *
 */
public class ImportDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 提示用户输入他的姓名
		System.out.println("请输入你的姓名>");
		// 定义变量来接收用户的输入
		String name = sc.next();
		// 再提示用户输入年龄
		System.out.println("\n\t你的年龄>");
		// 定义变量来保存用户的年龄
		int age = sc.nextInt();
		// 打印输出以上两个变量的值
		System.out.println("Hi," + name + ",你" + age + "岁了.");
		// 释放资源
		sc.close();
	}

}

