/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day12;

import java.util.Scanner;

/**
 * @author yejf
 *
 */
public class ExceptionDemo {

	public int divide(int a, int b) throws Exception {
		//
		//编码谨慎，来避免出现 RuntimeException
		if(b == 0) {
			//System.out.println("分母不能为0");
			//重新抛出异常
			throw new Exception("分母为0");
		}
		
		int result = a / b;
		return result;
	}
	
	public static void main(String[] args) {
		ExceptionDemo demo = new ExceptionDemo();
		try {
			int r = 0;
			
//			int i = inputInt("请输入一个整数>");
			int i = inputInt2("请输入一个整数>");
			
			r = demo.divide(10,i);
			System.out.println(r);
			
		} catch (Exception e) {
			e.printStackTrace();
			//获取异常的信息
			System.out.println(e.getMessage());
			System.out.println("未知的结果。");
		} finally {
			System.out.println(">>> 我是 finally ...");
		}
	}
	
	/***
	 * 从键盘读入一个整数
	 * @return
	 */
	public static int inputInt(String msg) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print(msg);
			int i = sc.nextInt();
			//返回
			return i;
		} catch (RuntimeException e) {
//			e.printStackTrace();
			System.out.println("\t输入不匹配...");
			return inputInt(msg);
		} finally {
			System.out.println("释放...");
			//释放
			sc.close();
		}
		
	}
	
	public static int inputInt2(String msg) {
		Scanner sc = new Scanner(System.in);
		try {
			
			int i = getInt(sc, msg);
			return i;
			
		} finally {
			System.out.println(">>释放..");
			sc.close();
		}
	}
	
	private static int getInt(Scanner sc, String msg) {
		
		try {
			System.out.println(msg);
			int i = sc.nextInt();
			return i;
		} catch (RuntimeException e) {
			sc.nextLine(); //把这一行读走
			System.out.printf("\t输入不匹配:%s\n",sc.nextLine());
			//要把sc中的缓存给清空
			return getInt(sc, msg);
		}
		
	}
}

