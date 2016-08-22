/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day06;

/**
 * @author yejf
 *
 */
public class Account1 {

	private String no;
	private double balance;
	/**
	 * 
	 */
	public Account1() {
		super();
	}
	/**
	 * @param no
	 * @param balance
	 */
	public Account1(String no, double balance) {
		super();
		this.no = no;
		this.balance = balance;
	}
	/**
	 * @return the no
	 */
	public String getNo() {
		return no;
	}
	/**
	 * @param no the no to set
	 */
	public void setNo(String no) {
		this.no = no;
	}
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/************
	 * ��Ǯҵ�񷽷�
	 * @param money
	 */
	public void deposit(double money){
		//������Ч���ж�
		if(money < 0){
			System.out.println("��������Ϊ����!");
			return ;
		}
		//���ӵ�ǰ�ʻ������
		this.balance += money;
	}
	
	/**********
	 * ȡǮҵ�񷽷�
	 * @param money
	 */
	public void withdraw(double money){
		if(money < 0){
			System.out.println("��������Ϊ����!");
			return ;
		}
		//
		if(this.balance < money){
			System.out.printf("�ʻ�[%s]����.\n",this.no);
			return ;
		}
		//���ٵ�ǰ�ʻ����
		this.balance -= money;
	}
	
	/**************
	 * ת��ҵ�񷽷�
	 * @param target
	 * @param money
	 */
	public void transfer(Account1 target, double money){
		if(money < 0){
			System.out.println("��������Ϊ����!");
			return ;
		}
		//
		if(this.balance < money){
			System.out.printf("�ʻ�[%s]������ת��.\n",this.no);
			return ;
		}
		//��ǰ�ʻ�����ȥ money
		this.balance -= money;
		//Ŀ���ʻ������� money
		target.balance += money;
	}
}
