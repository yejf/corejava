/**
 * �������xx��˾��Ȩ����
 */
package com.core.day07.homework;

/**
 * @author ��һ��
 *
 */
public abstract class Employee {
	
	private String position;// ְλ

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
