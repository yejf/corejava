/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day06;

/**
 * �ʻ�ҵ����
 * 
 * @author yejf
 *
 */
public class Account2Service {

	/******
	 * ��Ǯҵ�񷽷�
	 * 
	 * @param a
	 *            Ҫ�������ʻ�
	 * @param money
	 *            Ҫ��ŵĽ��
	 */
	public void deposit(Account2 a, double money) {
		// ������Ч���ж�
		if (money < 0) {
			System.out.println("��������Ϊ����!");
			return;
		}
		// ���ӵ�ǰ�ʻ������
		a.setBalance(a.getBalance()+money);
	}
	
	/*****
	 * ȡǮҵ�񷽷�
	 * @param a Ҫ�������ʻ�����
	 * @param money Ҫȡ���Ľ��
	 */
	public void withdraw(Account2 a, double money){
		if(money < 0){
			System.out.println("��������Ϊ����!");
			return ;
		}
		//
		if(a.getBalance() < money){
			System.out.printf("�ʻ�[%s]����.\n",a.getNo());
			return ;
		}
		//���ٵ�ǰ�ʻ����
		a.setBalance(a.getBalance() - money);
	}
	
	/***********
	 * ת��ҵ�񷽷�
	 * @param from Դ�ʻ�
	 * @param to  Ŀ���ʻ�
	 * @param money ת�ʽ��
	 */
	public void transfer(Account2 from, Account2 to, double money){
		if(money < 0){
			System.out.println("��������Ϊ����!");
			return ;
		}
		//
		if(from.getBalance() < money){
			System.out.printf("�ʻ�[%s]������ת��.\n",from.getNo());
			return ;
		}
		//Դ�ʻ�����С money
		from.setBalance(from.getBalance() - money);
		//Ŀ���ʻ�������� money
		to.setBalance(to.getBalance() + money);
	}
}
