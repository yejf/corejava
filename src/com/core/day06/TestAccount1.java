/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day06;

import java.util.Scanner;

/**
 * @author yejf
 *
 */
public class TestAccount1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//ģ�������ʻ�
		Account1 a1 = new Account1("1001", 1500);
		System.out.printf("�ʻ�[%s],���:%.2f\n", a1.getNo(),a1.getBalance());
		Scanner sc = new Scanner(System.in);
		//ȡǮ
		System.out.print("����������ȡ���Ľ��>");
		double money = sc.nextDouble();
		a1.withdraw(money);
		System.out.printf("��ǰ�ʻ�[%s],���:%.2f\n", a1.getNo(),a1.getBalance());
		
		//��Ǯ
		System.out.print("�������������Ľ��>");
		money = sc.nextDouble();
		a1.deposit(money);
		System.out.printf("��ǰ�ʻ�[%s],���:%.2f\n", a1.getNo(),a1.getBalance());
		
		//������һ���ʻ�
		Account1 a2 = new Account1("1002",200);
		System.out.printf("��ǰ�ʻ�[%s],���:%.2f\n", a2.getNo(),a2.getBalance());
		
		System.out.printf
			("--��ʼ��Ǯ���ʻ�[%s]ת���ʻ�[%s]\n",a1.getNo(),a2.getNo());
		System.out.printf("������ת�ʽ��>");
		money = sc.nextDouble();
		//ת��
		a1.transfer(a2, money);
		//��������ʻ�������
		System.out.printf("��ǰ�ʻ�[%s],���:%.2f\n", 
									a1.getNo(),a1.getBalance());
		System.out.printf("��ǰ�ʻ�[%s],���:%.2f\n", 
									a2.getNo(),a2.getBalance());
		
		sc.close();
	}

}
