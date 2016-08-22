/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yejf
 *
 */
public class CountMatcher {

	private static String content; //存放事先准备好的字符串
	
	static {
		StringBuilder builder = new StringBuilder();
		//添加内容到此builder内
		builder.append("The System class contains several useful class fields and methods.")
				.append("\nIt cannot be instantiated.")
				.append("\nAmong the facilities provided by the \nSystem class are standard input,")
				.append("\nstandard output, and error output streams; \naccess to externally ")
				.append("\ndefined properties and environment variables; \na means of loading files and libraries;")
				.append("\nand a utility method for quickly copying a portion of an array.")
				.append("please call: 13965828989 or email to hehe@163.com!");				
		//把builder只的内容赋给 content
		content = builder.toString();
	}
	
	/****
	 * 根据正则表达式来分析 content中的内容
	 * @param regex
	 */
	public static void find(String regex) {
		//1. 把正则表达式编译成 Pattern 对象
		Pattern p = Pattern.compile(regex);
		//2. 得到Matcher对象
		Matcher m = p.matcher(content);
		//3.循环多次匹配
		String result = null;
		//
		System.out.printf("\n开始尝试去匹配[%s]....\n",regex);
		int count = 0;
		while(m.find()) { //尝试一次匹配，如果成功，则返回true
			//
			count++; //计数一次
			//
			result = m.group(); //匹配成功的字符串
			System.out.printf("\t>>>找到[%s]在[%d]~[%d]位置处...\n"
						,result, m.start(), m.end());
		}
		//
		System.out.printf("\n共计找到:%d个.\n",count);
	}
	
	//程序入口
	public static void main(String[] args) {
		//先打印出字符串内容
		System.out.println(content);
		System.out.println("------------------\n请输入正则表达式>");
		Scanner sc = new Scanner(System.in);
		//
		String regex = sc.nextLine();
		//调用上面的方法
		find(regex);
		//
		sc.close();
	}
}

