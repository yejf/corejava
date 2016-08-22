/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day02;

import java.util.Random;
import java.util.Scanner;

/**
 * @author yejf
 *
 */
public class WhileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//创建Random对象
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		//
		System.out.println("请输入随机数的上限>");
		int max = sc.nextInt();
		System.out.println("\n\t请输入你的幸运数[1,"+max+"]>");
		int n = sc.nextInt();
		
		//定义变量，来计算循环次数
		int times = 0;
		boolean exit = false;
		//循环
		while(!exit){
			//生成随机数
			int rn = r.nextInt(max)+1;
			//输出这个随机数
			System.out.println("current random number:"+rn);
			//计数
			times++;
			//比较
			if(n == rn){
				exit = true;
			}
		}
		//
		System.out.println("\n共计花了"+times+"次才得到幸运数.");
		//
		sc.close();
	}

}
