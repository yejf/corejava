/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day08;

/**
 * 简单工厂类
 * @author yejf
 *
 */
public class MoveFactory {

	//提供一个公开静态方法返回具体的子类对象之一
	public static Movable getInstance
				(int capacity, int speed, String owner) {
		
		//里面的代码不做要求
		if(owner == null){
			return new Train(capacity, speed, "");
		}else{
			return new Plane(capacity, speed, "", owner);
		}
	}
	//...
}
