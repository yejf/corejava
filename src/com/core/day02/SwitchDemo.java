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
public class SwitchDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//从变量开始
		Scanner sc = new Scanner(System.in);
		//提示用户输入年和月
		System.out.println("请输入年份和月份>");
		//定义变量来接收用户的输入
		int year = sc.nextInt();
		int month = sc.nextInt();
		//定义 变量来保存天数
		int days = -1;
		//
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			days = 28;
			//进一步判断 是否是闰年
			if((year%4==0 && year%100!=0) || year%400 == 0){
				days += 1;
			}
			break;
		default:
			System.out.println("输入的月份不合法,程序退出.");

		}
		//输出结果
		if(days != -1){
			System.out.println(year+"年"+month+"月有"+days+"天.");
		}
		//
		sc.close();
	}

}
