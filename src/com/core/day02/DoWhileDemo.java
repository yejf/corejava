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
public class DoWhileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		//����һ�����������û���ѡ��
		int choice = -1;
		do {
			//��ӡһ���˵�
			System.out.println("======================");
			System.out.println("= 1 -> ��ʼ");
			System.out.println("= 0 -> �˳�.");
			System.out.println("======================");
			//��ʾ�û�ѡ��
			System.out.print("��ѡ��>");
			choice = sc.nextInt(); //��ȡ�û�������
			//��������Ҫ�����û������룬ִ�в�ͬ�Ĳ���
			switch (choice) {
			case 1:
				//��ʼ
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
				
				break;
			case 0:
				//�˳�
				System.out.println("\n:)ллʹ��!");
				break;
			default:
				//��ʾ�û����벻�Ϸ�
				System.out.println(":(���벻�Ϸ�.");
				break;
			}
			
		} while (choice != 0);
		//
		sc.close();
	}

}
