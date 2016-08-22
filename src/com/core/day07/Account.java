/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day07;

/**
 * 抽象父类
 * @author yejf
 *
 */
public abstract class Account {

	//共性属性
	private String no; //帐号
	private String real_name; //开户人真实姓名
	private String idcard; //身份证号码
	
	private double balance; //余额

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
	
	//业务方法
	
	/*****
	 * 统计帐户的总资金
	 * @return
	 */
	public abstract double total();
	
}



