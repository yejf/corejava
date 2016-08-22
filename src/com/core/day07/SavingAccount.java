/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day07;

import java.util.Date;

/**
 * @author yejf
 *
 */
public class SavingAccount extends Account {

	//����
	private double rate; //�껯������
	private Date start_date; //�������
	
	/**
	 * 
	 */
	public SavingAccount() {
		super();
	}

	/**
	 * @param rate
	 * @param start_date
	 */
	public SavingAccount(double rate, Date start_date) {
		super();
		this.rate = rate;
		this.start_date = start_date;
	}

	/**
	 * @param no
	 * @param real_name
	 * @param idcard
	 * @param balance
	 * @param rate
	 * @param start_date
	 */
	public SavingAccount(String no, String real_name, String idcard, 
						double balance, double rate, Date start_date) {
		super(no, real_name, idcard, balance); //���ø���4�ι���
		this.rate = rate;
		this.start_date = start_date;
	}

	
	/**
	 * @return the rate
	 */
	public double getRate() {
		return rate;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(double rate) {
		this.rate = rate;
	}

	/**
	 * @return the start_date
	 */
	public Date getStart_date() {
		return start_date;
	}

	/**
	 * @param start_date the start_date to set
	 */
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	/* (non-Javadoc)
	 * @see com.core.day07.Account#total()
	 */
	@Override
	public double total() {
		//�� ���+��Ϣ Ϊ�ܽ��
		//������Ϣ, ��ǰ��������start_date�������� * rate / 365
		long current = System.currentTimeMillis(); //��ǰϵͳʱ��ĺ�����
		long start = (start_date == null) ? 
					System.currentTimeMillis() : start_date.getTime();
		//������֮��Ĳ�ֵ ��ת������������������
		int days = (int)((current-start)/1000/60/60/24);		
		//�ټ�����Ϣ
		return getBalance()+ getBalance()*days*this.rate/365; 
	}

}
