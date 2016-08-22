/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
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

	//重写父类的业务方法
	/* (non-Javadoc)
	 * @see com.core.day07.Shape#area()
	 */
	@Override
	public double area() {
		System.out.println(">>>In Circle");
		//计算圆形 面积
		return this.radius*this.radius*Math.PI;
	}

	/* (non-Javadoc)
	 * @see com.core.day07.Shape#girth()
	 */
	@Override
	public double girth() {
		System.out.println(">>>In Circle");
		//计算圆形的周长
		return this.radius * 2 * Math.PI;
	}
	
}
