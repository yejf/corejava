/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
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
		System.out.println("����������Ϸ������>");
		int year = sc.nextInt();
		//
		if((year%4==0 && year%100!=0) || (year%400 == 0)){
			System.out.println(year+"��������.");
		}else{
			System.out.println(year+"�겻������.");
		}
		//
		sc.close();
	}

}

