/**
 * �������xx��˾��Ȩ����
 */
package com.core.day07.homework;

/**
 * @author ��һ��
 *
 */
public class Programmer extends Employee {
	private double salary;//��������
	private double bonus;//��Ŀ����

	/**
	 * 
	 */
	public Programmer() {
		super();
	}

	/**
	 * @param position
	 * @param salary
	 * @param bonus
	 */
	public Programmer(String position, double salary, double bonus) {
		super(position);
		this.salary = salary;
		this.bonus = bonus;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.core.day07.homework.Employee#pay()
	 */
	@Override
	public double pay() {

		return this.salary + this.bonus;
	}

}
