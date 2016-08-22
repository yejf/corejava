/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day07;

import java.util.Calendar;
import java.util.Date;

/**
 * @author yejf
 *
 */
public class TestAbstract {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//创建一个储蓄帐户
		Account a1 = new SavingAccount(0.035,createDate(2016, 5, 18));
		a1.setBalance(10000);
		a1.setNo("1001");
		a1.setReal_name("段林峰");
		//再创建一个帐户
		Account a2 = new CreditAccount(15000, 300);
		a2.setNo("1002");
		a2.setReal_name("李云雷");
		//把这个帐户放入数组
		Account[] arr = new Account[]{a1,a2};
		//
		for(Account a : arr){
			System.out.printf("帐户[%s]，拥有者[%s]，总资产[%.2f]\n"
							,a.getNo(),a.getReal_name(),a.total());
		}
		//
	}

	/****
	 * 根据给定的年、月、日来创建一个新的日期
	 * @param y
	 * @param m
	 * @param d
	 * @return 返回创建成功的日期
	 */
	public static Date createDate(int y, int m, int d){
		//创建Calendar对象
		Calendar c = Calendar.getInstance();
		//然后，修改这个日期年、月、日属性
		c.set(Calendar.YEAR, y);
		c.set(Calendar.MONTH, m-1);
		c.set(Calendar.DAY_OF_MONTH, d);
		//返回
		return c.getTime();
	}
}

