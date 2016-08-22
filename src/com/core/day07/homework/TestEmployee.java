/**
 * 本代码归xx公司版权所有
 */
package com.core.day07.homework;

/**
 * @author 陈一凡
 *
 */
public class TestEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee e1 = new Boss("老板", 20000);
		Employee e2 = new Programmer("程序员", 4500, 2000);
		Employee e3 = new Saler("销售员", 3000, 0.87);
		Employee e4 = new Temporary("临时工", 40, 160);

		Employee[] err = new Employee[] { e1, e2, e3, e4 };
		
		for (Employee e : err) {
			System.out.printf("%s每个月的工资为%.2f\n", e.getPosition(), e.pay());
		}

	}

}
