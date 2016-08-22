/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day07;

/**
 * @author yejf
 *
 */
public class CreditAccount extends Account {

	//属性
	private double credit; //信用额度
	private double cost; //已使用的额度
	
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
		super(no, real_name, idcard, balance); //调用父类构造
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

	//业务方法
	/* (non-Javadoc)
	 * @see com.core.day07.Account#total()
	 */
	@Override
	public double total() {
		//信用帐户的总额度=余额+信用额度-已花费的额度
		
		return getBalance() + this.credit - this.cost;
	}

}
