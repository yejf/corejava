/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day06;

/**
 * @author yejf
 *
 */
public class Animals {

	//属性
	private String name; //名字

	/**
	 * 
	 */
	public Animals() {
		super();
	}

	/**
	 * @param name
	 */
	public Animals(String name) {
		super();
		this.name = name;
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
	public void shout(){
		System.out.printf("[%s]正在发出叫声...\n",name);
	}
}
