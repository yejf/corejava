/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day12;

import java.util.Scanner;

import com.core.day06.Account2;

/**
 * @author yejf
 *
 */
public class TestAccount2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//创建业务对象
		AccountService as = new AccountService();
		//创建帐户对象
		Account2 a1 = new Account2("2001", 1200);
		System.out.printf("帐户[%s],余额:%.2f\n",a1.getNo(),a1.getBalance());
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入要存入的金额>");
		double money = sc.nextDouble();
		//通过业务对象调用方法
		as.deposit(a1, money);
		System.out.printf("帐户[%s],余额:%.2f\n",a1.getNo(),a1.getBalance());
		
		//转帐
		Account2 a2 = new Account2("2003", 150);
		System.out.printf("帐户[%s],余额:%.2f\n",a2.getNo(),a2.getBalance());
		System.out.println("---开始转帐");
		System.out.print("请输入要转入的金额>");
		money = sc.nextDouble();
		try {
			as.transfer(a1, a2, money);
		} catch (NotEnoughBalanceException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.printf("帐户[%s],余额:%.2f\n",a1.getNo(),a1.getBalance());
		System.out.printf("帐户[%s],余额:%.2f\n",a2.getNo(),a2.getBalance());
		
		//
		sc.close();
	}

}
