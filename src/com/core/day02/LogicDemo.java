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
public class LogicDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//
		System.out.println("��������������>");
		//����������� �û�������
		int i = sc.nextInt();
		//
		System.out.println("\n\t��������һ������>");
		//����������� �û�������
		int j = sc.nextInt();
		
		boolean b = i > j;
		
		if(!b){
			System.out.println("\t�����˶�·...");
		}
		//���߼�����
		b = b && (i % j == 0);
		System.out.println("����ǣ�"+b);
		
		
		//�ͷ���Դ
		sc.close();
	}

}
