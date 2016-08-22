/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day12;

/**
 * @author yejf
 *
 */
public abstract class Person {

	private String name; //姓名

	/**
	 * @param name
	 */
	public Person(String name) {
		super();
		this.name = name;
	}

	/**
	 * 
	 */
	public Person() {
		super();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	//业务方法
	public abstract void run();
	
}

