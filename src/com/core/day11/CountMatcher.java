/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
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

	private static String content; //�������׼���õ��ַ���
	
	static {
		StringBuilder builder = new StringBuilder();
		//������ݵ���builder��
		builder.append("The System class contains several useful class fields and methods.")
				.append("\nIt cannot be instantiated.")
				.append("\nAmong the facilities provided by the \nSystem class are standard input,")
				.append("\nstandard output, and error output streams; \naccess to externally ")
				.append("\ndefined properties and environment variables; \na means of loading files and libraries;")
				.append("\nand a utility method for quickly copying a portion of an array.")
				.append("please call: 13965828989 or email to hehe@163.com!");				
		//��builderֻ�����ݸ��� content
		content = builder.toString();
	}
	
	/****
	 * ����������ʽ������ content�е�����
	 * @param regex
	 */
	public static void find(String regex) {
		//1. ��������ʽ����� Pattern ����
		Pattern p = Pattern.compile(regex);
		//2. �õ�Matcher����
		Matcher m = p.matcher(content);
		//3.ѭ�����ƥ��
		String result = null;
		//
		System.out.printf("\n��ʼ����ȥƥ��[%s]....\n",regex);
		int count = 0;
		while(m.find()) { //����һ��ƥ�䣬����ɹ����򷵻�true
			//
			count++; //����һ��
			//
			result = m.group(); //ƥ��ɹ����ַ���
			System.out.printf("\t>>>�ҵ�[%s]��[%d]~[%d]λ�ô�...\n"
						,result, m.start(), m.end());
		}
		//
		System.out.printf("\n�����ҵ�:%d��.\n",count);
	}
	
	//�������
	public static void main(String[] args) {
		//�ȴ�ӡ���ַ�������
		System.out.println(content);
		System.out.println("------------------\n������������ʽ>");
		Scanner sc = new Scanner(System.in);
		//
		String regex = sc.nextLine();
		//��������ķ���
		find(regex);
		//
		sc.close();
	}
}

