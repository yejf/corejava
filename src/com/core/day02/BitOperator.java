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
public class BitOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入任意整数>");
		//定义变量来接收用户的输入
		int i = sc.nextInt();
		//得到它整数的二进制字符串
		String iBin = Integer.toBinaryString(i);
		//输出
		System.out.println(i+"的二进制："+iBin);
		//
		System.out.println("\t请输入要取反的低位数>");
		int n = sc.nextInt();
		//定义掩码，根据位数
		int mask = (1 << n) - 1;
		//输出这个掩码
		System.out.println("掩码是："+mask);
		//计算
		int j = i ^ mask;
		//得到j的二进制字符串
		String jBin = Integer.toBinaryString(j);
		//
		System.out.println(j+"的二进制是："+jBin);
		//
		sc.close();
		
		//现在，把变量i和j的值打印出来
		System.out.println("i = "+i);
		System.out.println("j = "+j);
		
		//交换
		i = i ^ j;
		j = i ^ j;
		i = i ^ j;
		System.out.println("交换后：");

		System.out.println("i = "+i);
		System.out.println("j = "+j);
	}

}
