/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day06;

/**
 * @author yejf
 *
 */
public class Dog extends Animals {

	//属性
	private int teeth; //牙齿

	/**
	 * @param name
	 * @param teeth
	 */
	public Dog(String name, int teeth) {
		super(name);
		this.teeth = teeth;
	}

	/**
	 * @return the teeth
	 */
	public int getTeeth() {
		return teeth;
	}

	/**
	 * @param teeth the teeth to set
	 */
	public void setTeeth(int teeth) {
		this.teeth = teeth;
	}
	
	//业务方法
	public void eatBone(){
		System.out.printf
			("[%s]拥有[%d]颗牙齿，可以吃骨头.\n",getName(),teeth);
	}
}
