/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day07;

/**
 * @author yejf
 *
 */
public class Rectangle extends Shape {

	private double width;
	
	private double length;

	/**
	 * @param name
	 * @param width
	 * @param length
	 */
	public Rectangle(String name, double width, double length) {
		super(name);
		this.width = width;
		this.length = length;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}

	//重写业务方法
	
	/* (non-Javadoc)
	 * @see com.core.day07.Shape#area()
	 */
	@Override
	public double area() {
		System.out.println(">>>>in Rectangle....");
		//计算矩形的面积
		return this.width * this.length;
	}

	/* (non-Javadoc)
	 * @see com.core.day07.Shape#girth()
	 */
	@Override
	public double girth() {
		System.out.println(">>>>in Rectangle....");
		//计算矩形的周长
		return 2 * (this.length + this.width);
	}
	
	
}
