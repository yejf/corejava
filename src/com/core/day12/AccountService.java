/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day12;

import com.core.day06.Account2;

/**
 * @author yejf
 *
 */
public class AccountService {

	/******
	 * 存钱业务方法
	 * 
	 * @param a
	 *            要操作的帐户
	 * @param money
	 *            要存放的金额
	 */
	public void deposit(Account2 a, double money) {
		// 参数有效性判断
		if (money < 0) {
			//直接抛出异常
			throw new InvalidMoneyException("所存金额为负数"); 
		}
		// 增加当前帐户的余额
		a.setBalance(a.getBalance() + money);
	}

	/*****
	 * 取钱业务方法
	 * 
	 * @param a
	 *            要操作的帐户对象
	 * @param money
	 *            要取出的金额
	 * @throws NotEnoughBalanceException 
	 */
	public void withdraw(Account2 a, double money) 
							throws NotEnoughBalanceException {
		if (money < 0) {
			/*System.out.println("参数不能为负数!");
			return;*/
			//直接抛出异常
			throw new InvalidMoneyException("所存金额为负数"); 
		}
		//
		if (a.getBalance() < money) {
			/*System.out.printf("帐户[%s]余额不足.\n", a.getNo());
			return;*/
			//直接抛出异常
			throw new NotEnoughBalanceException
						("帐户["+a.getNo()+"]余额不足.");
		}
		// 减少当前帐户余额
		a.setBalance(a.getBalance() - money);
	}

	/***********
	 * 转帐业务方法
	 * 
	 * @param from
	 *            源帐户
	 * @param to
	 *            目标帐户
	 * @param money
	 *            转帐金额
	 * @throws NotEnoughBalanceException 
	 */
	public void transfer(Account2 from, Account2 to, double money)
									throws NotEnoughBalanceException {
		if (money < 0) {
			//直接抛出异常
			throw new InvalidMoneyException("所存金额为负数"); 
		}
		//
		if (from.getBalance() < money) {
			throw new NotEnoughBalanceException
						("帐户["+from.getNo()+"]余额不足.");
		}
		// 源帐户余额减小 money
		from.setBalance(from.getBalance() - money);
		// 目标帐户余额增加 money
		to.setBalance(to.getBalance() + money);
	}
}
