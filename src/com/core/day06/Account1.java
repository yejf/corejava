/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
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
	 * 存钱业务方法
	 * @param money
	 */
	public void deposit(double money){
		//参数有效性判断
		if(money < 0){
			System.out.println("参数不能为负数!");
			return ;
		}
		//增加当前帐户的余额
		this.balance += money;
	}
	
	/**********
	 * 取钱业务方法
	 * @param money
	 */
	public void withdraw(double money){
		if(money < 0){
			System.out.println("参数不能为负数!");
			return ;
		}
		//
		if(this.balance < money){
			System.out.printf("帐户[%s]余额不足.\n",this.no);
			return ;
		}
		//减少当前帐户余额
		this.balance -= money;
	}
	
	/**************
	 * 转帐业务方法
	 * @param target
	 * @param money
	 */
	public void transfer(Account1 target, double money){
		if(money < 0){
			System.out.println("参数不能为负数!");
			return ;
		}
		//
		if(this.balance < money){
			System.out.printf("帐户[%s]余额不足以转帐.\n",this.no);
			return ;
		}
		//当前帐户余额减去 money
		this.balance -= money;
		//目标帐户余额加上 money
		target.balance += money;
	}
}
