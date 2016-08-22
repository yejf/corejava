/**
 * �������xx��˾��Ȩ����
 */
package com.core.day07.homework;

/**
 * @author ��һ��
 *
 */
public class Saler extends Employee {
	private double salary;// ��н
	private double rate;// �������ָ��

	/**
	 * 
	 */
	public Saler() {
		super();
	}

	/**
	 * @param position
	 * @param salary
	 * @param bonus
	 * @param rate
	 */
	public Saler(String position, double salary, double rate) {
		super(position);
		this.salary = salary;
		this.rate = rate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.core.day07.homework.Employee#pay()
	 */
	@Override
	public double pay() {
		if (rate >= 1.2) {
			return this.salary + 10000.00;
		} else if (rate >= 1.0) {
			return this.salary + 5000.00;
		} else if (rate >= 0.85) {
			return this.salary + 3000.00;
		} else {
			return this.salary;
		}
	}

}
