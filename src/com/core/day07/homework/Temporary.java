/**
 * �������xx��˾��Ȩ����
 */
package com.core.day07.homework;

/**
 * @author ��һ��
 *
 */
public class Temporary extends Employee {
	
	private double cost;// ÿСʱ����
	private int hours;// ����Сʱ��

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
