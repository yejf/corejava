/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day08;

/**
 * @author yejf
 *
 */
public class Train extends Vehicle implements CheckSpeed {

	public Train(int capacity, int speed, String name) {
		super(capacity, speed, name);
	}

	/* (non-Javadoc)
	 * @see com.core.day08.Movable#move(int)
	 */
	@Override
	public void move(int direction) {
		System.out.printf
			("一辆载客[%d]人的火车以[%d]的时速向[%s]开去.\n"
					,getCapacity(),getSpeed(),convert(direction));
	}

}
