/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day11;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author yejf
 *
 */
public class PatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter string>");
		String content = sc.nextLine();
		//
		System.out.println("Please enter regex>");
		String regex = sc.nextLine();
		//
		System.out.println("此字符串匹配正则吗？");
		//
		boolean b = Pattern.matches(regex, content);
		
		System.out.printf("\n\t%b\n",b);
		
		sc.close();
	}

}

