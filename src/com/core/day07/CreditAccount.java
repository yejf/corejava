/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day07;

/**
 * @author yejf
 *
 */
public class CreditAccount extends Account {

	//����
	private double credit; //���ö��
	private double cost; //��ʹ�õĶ��
	
	/**
	 * 
	 */
	public CreditAccount() {
		super();
	}

	/**
	 * @param credit
	 * @param cost
	 */
	public CreditAccount(double credit, double cost) {
		super();
		this.credit = credit;
		this.cost = cost;
	}

	/**
	 * @param no
	 * @param real_name
	 * @param idcard
	 * @param balance
	 * @param credit
	 * @param cost
	 */
	public CreditAccount(String no, String real_name, String idcard, 
						double balance, double credit, double cost) {
		super(no, real_name, idcard, balance); //���ø��๹��
		this.credit = credit;
		this.cost = cost;
	}

	/**
	 * @return the credit
	 */
	public double getCredit() {
		return credit;
	}

	/**
	 * @param credit the credit to set
	 */
	public void setCredit(double credit) {
		this.credit = credit;
	}

	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}

	//ҵ�񷽷�
	/* (non-Javadoc)
	 * @see com.core.day07.Account#total()
	 */
	@Override
	public double total() {
		//�����ʻ����ܶ��=���+���ö��-�ѻ��ѵĶ��
		
		return getBalance() + this.credit - this.cost;
	}

}
