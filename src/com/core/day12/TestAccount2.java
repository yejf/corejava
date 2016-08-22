/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day12;

import java.util.Scanner;

import com.core.day06.Account2;

/**
 * @author yejf
 *
 */
public class TestAccount2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//����ҵ�����
		AccountService as = new AccountService();
		//�����ʻ�����
		Account2 a1 = new Account2("2001", 1200);
		System.out.printf("�ʻ�[%s],���:%.2f\n",a1.getNo(),a1.getBalance());
		Scanner sc = new Scanner(System.in);
		System.out.print("������Ҫ����Ľ��>");
		double money = sc.nextDouble();
		//ͨ��ҵ�������÷���
		as.deposit(a1, money);
		System.out.printf("�ʻ�[%s],���:%.2f\n",a1.getNo(),a1.getBalance());
		
		//ת��
		Account2 a2 = new Account2("2003", 150);
		System.out.printf("�ʻ�[%s],���:%.2f\n",a2.getNo(),a2.getBalance());
		System.out.println("---��ʼת��");
		System.out.print("������Ҫת��Ľ��>");
		money = sc.nextDouble();
		try {
			as.transfer(a1, a2, money);
		} catch (NotEnoughBalanceException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.printf("�ʻ�[%s],���:%.2f\n",a1.getNo(),a1.getBalance());
		System.out.printf("�ʻ�[%s],���:%.2f\n",a2.getNo(),a2.getBalance());
		
		//
		sc.close();
	}

}
