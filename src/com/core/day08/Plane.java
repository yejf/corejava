/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day08;

/**
 * @author yejf
 *
 */
public class Plane extends Vehicle {
	
	private String owner; //归属航空公司 
	
	/**
	 * @param capacity
	 * @param speed
	 * @param name
	 * @param owner
	 */
	public Plane(int capacity, int speed, String name, String owner) {
		super(capacity, speed, name);
		this.owner = owner;
	}

	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}


	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}


	/* (non-Javadoc)
	 * @see com.core.day08.Movable#move(int)
	 */
	@Override
	public void move(int direction) {
		System.out.printf
			("一架[%s]的飞机满载[%d]名客人正以[%d]的速度向[%s]飞去.\n"
					,owner,getCapacity(),getSpeed(),convert(direction));
	}

}
