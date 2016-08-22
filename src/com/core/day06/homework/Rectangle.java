/**
 * 
 */
package com.core.day06.homework;

/**
 * @author dell
 *
 */
public class Rectangle extends Figure {
	private double length;
	private double wide;
	
	public Rectangle(String name, double length, double wide) {
		super(name);
		this.length = length;
		this.wide = wide;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWide() {
		return wide;
	}
	public void setWide(double wide) {
		this.wide = wide;
	}
	public void getArea(){
		double m=this.length*this.wide;
		System.out.printf("%s的面积是：%.3f\n",this.getName(),m);
	}
	public void getPerimeter(){
		double m=2*(this.length+this.wide);
		System.out.printf("%s的周长是：%.3f\n",this.getName(),m);
	}
}
