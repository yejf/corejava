/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day06;

import java.util.Scanner;

/**
 * @author yejf
 *
 */
public class TestAccount1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//模拟两个帐户
		Account1 a1 = new Account1("1001", 1500);
		System.out.printf("帐户[%s],余额:%.2f\n", a1.getNo(),a1.getBalance());
		Scanner sc = new Scanner(System.in);
		//取钱
		System.out.print("请输入你想取出的金额>");
		double money = sc.nextDouble();
		a1.withdraw(money);
		System.out.printf("当前帐户[%s],余额:%.2f\n", a1.getNo(),a1.getBalance());
		
		//存钱
		System.out.print("请输入你想存入的金额>");
		money = sc.nextDouble();
		a1.deposit(money);
		System.out.printf("当前帐户[%s],余额:%.2f\n", a1.getNo(),a1.getBalance());
		
		//创建另一个帐户
		Account1 a2 = new Account1("1002",200);
		System.out.printf("当前帐户[%s],余额:%.2f\n", a2.getNo(),a2.getBalance());
		
		System.out.printf
			("--开始把钱从帐户[%s]转到帐户[%s]\n",a1.getNo(),a2.getNo());
		System.out.printf("请输入转帐金额>");
		money = sc.nextDouble();
		//转帐
		a1.transfer(a2, money);
		//输出两个帐户的数据
		System.out.printf("当前帐户[%s],余额:%.2f\n", 
									a1.getNo(),a1.getBalance());
		System.out.printf("当前帐户[%s],余额:%.2f\n", 
									a2.getNo(),a2.getBalance());
		
		sc.close();
	}

}
