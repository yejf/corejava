/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day10.homework;

import java.util.Scanner;

/**
 * @author yejf
 *
 */
public class TestException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ������>");
		
		try {
			int i = sc.nextInt();
			
			System.out.println("��������: "+i);
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("�������");
			System.out.println("ԭ��"+e.getMessage());
			System.out.println("�쳣��ջ��");
			e.printStackTrace();
		}
		
		sc.close();
	}

}

