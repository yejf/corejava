/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day07;

import java.util.Date;

/**
 * @author yejf
 *
 */
public class SavingAccount extends Account {

	//属性
	private double rate; //年化收益率
	private Date start_date; //存款日期
	
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
		super(no, real_name, idcard, balance); //调用父类4参构造
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
		//以 余额+利息 为总金额
		//计算利息, 当前的日期与start_date相差的天数 * rate / 365
		long current = System.currentTimeMillis(); //当前系统时间的毫秒数
		long start = (start_date == null) ? 
					System.currentTimeMillis() : start_date.getTime();
		//这两个之间的差值 再转换成天数，四舍五入
		int days = (int)((current-start)/1000/60/60/24);		
		//再计算利息
		return getBalance()+ getBalance()*days*this.rate/365; 
	}

}
