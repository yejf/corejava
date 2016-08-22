/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
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
		super(); //调用父类空参构造，你写与不写，它就在这儿！
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//业务方法
	/****
	 * 求面积
	 * @return
	 */
	public abstract double area();
	
	/*****
	 * 求周长0
	 * @return
	 */
	public abstract double girth();
}
