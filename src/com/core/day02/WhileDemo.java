/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day02;

import java.util.Random;
import java.util.Scanner;

/**
 * @author yejf
 *
 */
public class WhileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//����Random����
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		//
		System.out.println("�����������������>");
		int max = sc.nextInt();
		System.out.println("\n\t���������������[1,"+max+"]>");
		int n = sc.nextInt();
		
		//���������������ѭ������
		int times = 0;
		boolean exit = false;
		//ѭ��
		while(!exit){
			//���������
			int rn = r.nextInt(max)+1;
			//�����������
			System.out.println("current random number:"+rn);
			//����
			times++;
			//�Ƚ�
			if(n == rn){
				exit = true;
			}
		}
		//
		System.out.println("\n���ƻ���"+times+"�βŵõ�������.");
		//
		sc.close();
	}

}
