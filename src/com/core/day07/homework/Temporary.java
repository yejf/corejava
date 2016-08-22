/**
 * 本代码归xx公司版权所有
 */
package com.core.day07.homework;

/**
 * @author 陈一凡
 *
 */
public class Temporary extends Employee {
	
	private double cost;// 每小时收入
	private int hours;// 工作小时数

	/**
	 * 
	 */
	public Temporary() {
		super();
	}

	/**
	 * @param position
	 * @param cost
	 * @param hours
	 */
	public Temporary(String position, double cost, int hours) {
		super(position);
		this.cost = cost;
		this.hours = hours;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.core.day07.homework.Employee#pay()
	 */
	@Override
	public double pay() {

		return this.cost * hours;
	}

}
