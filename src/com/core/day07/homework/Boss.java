/**
 * �������xx��˾��Ȩ����
 */
package com.core.day07.homework;

/**
 * @author ��һ��
 *
 */
public class Boss extends Employee {

	private double salary;//�̶�н��

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
