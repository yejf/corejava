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
public class BitDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数>");
		//定义变量来接收用户的输入
		int i = sc.nextInt();
		//分别调用方法，把这个整数转换成8、16、2进制字符串形式
		String iBin = Integer.toBinaryString(i);
		String iOct = Integer.toOctalString(i);
		String iHex = Integer.toHexString(i);
		//分别输出
		System.out.println(i+"的二进制是："+iBin);
		System.out.println(i+"的八进制是："+iOct);
		System.out.println(i+"的十六进制是："+iHex);
		
		//释放资源
		sc.close();
	}

}

