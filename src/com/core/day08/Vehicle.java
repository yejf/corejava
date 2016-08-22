/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day08;

/**
 * @author yejf
 *
 */
public abstract class Vehicle implements Movable {

	private int capacity; //载客量
	private int speed; //移动速度
	private String name; //交通工具名称
	
	public Vehicle() {
		super();
	}

	public Vehicle(int capacity, int speed, String name) {
		super();
		this.capacity = capacity;
		this.speed = speed;
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//提供一个把整数方向转换成字符串的业务方法，以备子类共用
	protected String convert(int direction) {
		String str = "";
		switch (direction) {
		case EAST:
			str = "东边";
			break;
		case WEST:
			str = "西边";
			break;
		case NORTH:
			str = "北边";
			break;
		case SOUTH:
			str = "南边";
			break;
		default:
			str = "未知方向";
			break;
		}
		return str;
	}
}
