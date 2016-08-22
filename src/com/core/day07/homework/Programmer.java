/**
 * 本代码归xx公司版权所有
 */
package com.core.day07.homework;

/**
 * @author 陈一凡
 *
 */
public class Programmer extends Employee {
	private double salary;//基本工资
	private double bonus;//项目奖金

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
