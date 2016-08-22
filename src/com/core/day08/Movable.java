/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day08;

/**
 * @author yejf
 *
 */
public interface Movable {

	// 属性
	int EAST = 1;
	int WEST = 2;
	int SOUTH = 3;
	int NORTH = 4;
	
	//方法
	/****
	 * 获取移动的速度
	 * @return
	 */
	int getSpeed();
	
	/****
	 * 移动到指定的方向
	 * @param direction
	 */
	void move(int direction);
}


