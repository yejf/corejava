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
public class IfDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入任意合法的年份>");
		int year = sc.nextInt();
		//
		if((year%4==0 && year%100!=0) || (year%400 == 0)){
			System.out.println(year+"年是闰年.");
		}else{
			System.out.println(year+"年不是闰年.");
		}
		//
		sc.close();
	}

}

