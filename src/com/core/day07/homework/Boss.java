/**
 * 本代码归xx公司版权所有
 */
package com.core.day07.homework;

/**
 * @author 陈一凡
 *
 */
public class Boss extends Employee {

	private double salary;//固定薪资

	/**
	 * 
	 */
	public Boss() {
		super();
	}

	/**
	 * @param position
	 * @param salary
	 */
	public Boss(String position, double salary) {
		super(position);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.core.day07.homework.Employee#pay()
	 */
	@Override
	public double pay() {
		return getSalary();
	}

}
