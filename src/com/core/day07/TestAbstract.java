/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
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
		//����һ�������ʻ�
		Account a1 = new SavingAccount(0.035,createDate(2016, 5, 18));
		a1.setBalance(10000);
		a1.setNo("1001");
		a1.setReal_name("���ַ�");
		//�ٴ���һ���ʻ�
		Account a2 = new CreditAccount(15000, 300);
		a2.setNo("1002");
		a2.setReal_name("������");
		//������ʻ���������
		Account[] arr = new Account[]{a1,a2};
		//
		for(Account a : arr){
			System.out.printf("�ʻ�[%s]��ӵ����[%s]�����ʲ�[%.2f]\n"
							,a.getNo(),a.getReal_name(),a.total());
		}
		//
	}

	/****
	 * ���ݸ������ꡢ�¡���������һ���µ�����
	 * @param y
	 * @param m
	 * @param d
	 * @return ���ش����ɹ�������
	 */
	public static Date createDate(int y, int m, int d){
		//����Calendar����
		Calendar c = Calendar.getInstance();
		//Ȼ���޸���������ꡢ�¡�������
		c.set(Calendar.YEAR, y);
		c.set(Calendar.MONTH, m-1);
		c.set(Calendar.DAY_OF_MONTH, d);
		//����
		return c.getTime();
	}
}

