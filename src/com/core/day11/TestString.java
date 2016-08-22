/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
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
		//���÷���
		//stringPlus();
		builderConcat();
		//
		long end = System.currentTimeMillis();
		//����������ʱ����������Ϊ ����ִ�������ѵ�ʱ�䣬��λ�Ǻ���
		System.out.printf("����ʱ�䣺%d ms.\n", end-start);
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
	
	//��һ��������ʹ��+��ƴ���ַ���
	public static String stringPlus() {
		String content = "";
		for(int i=0;i<20000;i++) {
			content += "hello"+i;
		}
		return content;
	}

	//�ڶ���������ʹ�� StringBuilder ��ƴ���ַ���
	public static String builderConcat() {
		StringBuilder builder = new StringBuilder();
		for(int i=0;i<20000;i++) {
			builder.append("hello").append(i);
		}
		return builder.toString();
	}
	
	
}
