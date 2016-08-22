/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day06;

/**
 * @author yejf
 *
 */
public class Account2 {

	private String no;
	private double balance;
	
	/**
	 * 
	 */
	public Account2() {
		super();
	}
	/**
	 * @param no
	 * @param balance
	 */
	public Account2(String no, double balance) {
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
	
}
