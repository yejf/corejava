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
public class DoWhileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		//定义一个变量保存用户的选择
		int choice = -1;
		do {
			//打印一个菜单
			System.out.println("======================");
			System.out.println("= 1 -> 开始");
			System.out.println("= 0 -> 退出.");
			System.out.println("======================");
			//提示用户选择
			System.out.print("请选择>");
			choice = sc.nextInt(); //读取用户的输入
			//接下来，要根据用户的输入，执行不同的操作
			switch (choice) {
			case 1:
				//开始
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
				
				break;
			case 0:
				//退出
				System.out.println("\n:)谢谢使用!");
				break;
			default:
				//表示用户输入不合法
				System.out.println(":(输入不合法.");
				break;
			}
			
		} while (choice != 0);
		//
		sc.close();
	}

}
