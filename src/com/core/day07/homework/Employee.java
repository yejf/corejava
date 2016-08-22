/**
 * 本代码归xx公司版权所有
 */
package com.core.day07.homework;

/**
 * @author 陈一凡
 *
 */
public abstract class Employee {
	
	private String position;// 职位

	/**
	 * 
	 */
	public Employee() {
		super();
	}

	/**
	 * @param position
	 * @param pay
	 */
	public Employee(String position) {
		super();
		this.position = position;

	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public abstract double pay();

}
