/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day12;

import com.core.day06.Account2;

/**
 * @author yejf
 *
 */
public class AccountService {

	/******
	 * ��Ǯҵ�񷽷�
	 * 
	 * @param a
	 *            Ҫ�������ʻ�
	 * @param money
	 *            Ҫ��ŵĽ��
	 */
	public void deposit(Account2 a, double money) {
		// ������Ч���ж�
		if (money < 0) {
			//ֱ���׳��쳣
			throw new InvalidMoneyException("������Ϊ����"); 
		}
		// ���ӵ�ǰ�ʻ������
		a.setBalance(a.getBalance() + money);
	}

	/*****
	 * ȡǮҵ�񷽷�
	 * 
	 * @param a
	 *            Ҫ�������ʻ�����
	 * @param money
	 *            Ҫȡ���Ľ��
	 * @throws NotEnoughBalanceException 
	 */
	public void withdraw(Account2 a, double money) 
							throws NotEnoughBalanceException {
		if (money < 0) {
			/*System.out.println("��������Ϊ����!");
			return;*/
			//ֱ���׳��쳣
			throw new InvalidMoneyException("������Ϊ����"); 
		}
		//
		if (a.getBalance() < money) {
			/*System.out.printf("�ʻ�[%s]����.\n", a.getNo());
			return;*/
			//ֱ���׳��쳣
			throw new NotEnoughBalanceException
						("�ʻ�["+a.getNo()+"]����.");
		}
		// ���ٵ�ǰ�ʻ����
		a.setBalance(a.getBalance() - money);
	}

	/***********
	 * ת��ҵ�񷽷�
	 * 
	 * @param from
	 *            Դ�ʻ�
	 * @param to
	 *            Ŀ���ʻ�
	 * @param money
	 *            ת�ʽ��
	 * @throws NotEnoughBalanceException 
	 */
	public void transfer(Account2 from, Account2 to, double money)
									throws NotEnoughBalanceException {
		if (money < 0) {
			//ֱ���׳��쳣
			throw new InvalidMoneyException("������Ϊ����"); 
		}
		//
		if (from.getBalance() < money) {
			throw new NotEnoughBalanceException
						("�ʻ�["+from.getNo()+"]����.");
		}
		// Դ�ʻ�����С money
		from.setBalance(from.getBalance() - money);
		// Ŀ���ʻ�������� money
		to.setBalance(to.getBalance() + money);
	}
}
