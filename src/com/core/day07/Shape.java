/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day07;

/**
 * @author yejf
 *
 */
public abstract class Shape {

	private String name;
	
	/**
	 * @param name
	 */
	public Shape(String name) {
		super(); //���ø���ղι��죬��д�벻д�������������
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//ҵ�񷽷�
	/****
	 * �����
	 * @return
	 */
	public abstract double area();
	
	/*****
	 * ���ܳ�0
	 * @return
	 */
	public abstract double girth();
}
