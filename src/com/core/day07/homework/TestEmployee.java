/**
 * �������xx��˾��Ȩ����
 */
package com.core.day07.homework;

/**
 * @author ��һ��
 *
 */
public class TestEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee e1 = new Boss("�ϰ�", 20000);
		Employee e2 = new Programmer("����Ա", 4500, 2000);
		Employee e3 = new Saler("����Ա", 3000, 0.87);
		Employee e4 = new Temporary("��ʱ��", 40, 160);

		Employee[] err = new Employee[] { e1, e2, e3, e4 };
		
		for (Employee e : err) {
			System.out.printf("%sÿ���µĹ���Ϊ%.2f\n", e.getPosition(), e.pay());
		}

	}

}
