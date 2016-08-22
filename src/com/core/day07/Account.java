/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day07;

/**
 * ������
 * @author yejf
 *
 */
public abstract class Account {

	//��������
	private String no; //�ʺ�
	private String real_name; //��������ʵ����
	private String idcard; //���֤����
	
	private double balance; //���

	/**
	 * 
	 */
	public Account() {
//		super();
	}
	
	/**
	 * @param no
	 * @param real_name
	 * @param idcard
	 * @param balance
	 */
	public Account(String no, String real_name, String idcard, double balance) {
		super();
		this.no = no;
		this.real_name = real_name;
		this.idcard = idcard;
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
	 * @return the real_name
	 */
	public String getReal_name() {
		return real_name;
	}

	/**
	 * @param real_name the real_name to set
	 */
	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}

	/**
	 * @return the idcard
	 */
	public String getIdcard() {
		return idcard;
	}

	/**
	 * @param idcard the idcard to set
	 */
	public void setIdcard(String idcard) {
		this.idcard = idcard;
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
	
	//ҵ�񷽷�
	
	/*****
	 * ͳ���ʻ������ʽ�
	 * @return
	 */
	public abstract double total();
	
}



