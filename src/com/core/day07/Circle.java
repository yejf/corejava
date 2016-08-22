/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day07;

/**
 * @author yejf
 *
 */
public class Circle extends Shape {

	private double radius;

	/**
	 * @param name
	 * @param radius
	 */
	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	//��д�����ҵ�񷽷�
	/* (non-Javadoc)
	 * @see com.core.day07.Shape#area()
	 */
	@Override
	public double area() {
		System.out.println(">>>In Circle");
		//����Բ�� ���
		return this.radius*this.radius*Math.PI;
	}

	/* (non-Javadoc)
	 * @see com.core.day07.Shape#girth()
	 */
	@Override
	public double girth() {
		System.out.println(">>>In Circle");
		//����Բ�ε��ܳ�
		return this.radius * 2 * Math.PI;
	}
	
}
