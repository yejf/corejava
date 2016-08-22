/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day06;

/**
 * @author yejf
 *
 */
public class Bird extends Animals {

	//属性
	private boolean wing; //有翅膀是否能飞

	/**
	 * @param name
	 * @param wing
	 */
	public Bird(String name, boolean wing) {
		super(name);
		this.wing = wing;
	}

	/**
	 * @return the wing
	 */
	public boolean isWing() {
		return wing;
	}

	/**
	 * @param wing the wing to set
	 */
	public void setWing(boolean wing) {
		this.wing = wing;
	}
	
	//业务方法
	public void fly(){
		if(wing){
			System.out.printf("[%s]可以飞翔.\n",getName());
		}else{
			System.out.printf("[%s]的翅膀不能飞...\n",getName());
		}
	}
}
