/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day11;

import java.util.Scanner;

/**
 * @author yejf
 *
 */
public class TestString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//
		long start = System.currentTimeMillis(); 
		//调用方法
		//stringPlus();
		builderConcat();
		//
		long end = System.currentTimeMillis();
		//把以上两个时间点相减，即为 方法执行所花费的时间，单位是毫秒
		System.out.printf("花费时间：%d ms.\n", end-start);
		//
		Scanner sc = new Scanner(System.in);
		//
		System.out.println("Please enter String>");
		String content = sc.nextLine();
		//
		System.out.println("Please enter regex>");
		String regex = sc.nextLine();
		//
		System.out.println("please enter limit>");
		int limit = sc.nextInt();
		//
		String[] result = content.split(regex,limit);
		//
		for (int i = 0; i < result.length; i++) {
			System.out.printf("result[%d]=%s\n",i,result[i]);
		}
		
		//
		sc.close();
	}
	
	//第一个方法，使用+来拼接字符串
	public static String stringPlus() {
		String content = "";
		for(int i=0;i<20000;i++) {
			content += "hello"+i;
		}
		return content;
	}

	//第二个方法，使用 StringBuilder 来拼接字符串
	public static String builderConcat() {
		StringBuilder builder = new StringBuilder();
		for(int i=0;i<20000;i++) {
			builder.append("hello").append(i);
		}
		return builder.toString();
	}
	
	
}
