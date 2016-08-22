/**
 * 
 */
package com.core.day06.homework;

/**
 * @author dell
 *
 */
public class Circle extends Figure {
	private double radius;
    
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}
	
	public void getArea(){
		double m=3.14*this.radius*this.radius;
		System.out.printf("%s的面积是：%.3f\n",this.getName(),m);
	}
	public void getPerimeter(){
		double m=2*this.radius*3.14;
		System.out.printf("%s的周长是：%.3f\n",this.getName(),m);
	}

}
