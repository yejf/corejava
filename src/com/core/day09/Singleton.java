/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day09;

/**
 * 设计模式之单例模式
 * @author yejf
 *
 */
public class Singleton {

	//1. 构造方法私有化
	private Singleton() {
		
	}
	
	//2. 提供私有、静态的本类类型的属性
	private static Singleton instance = new Singleton();
	
	//3. 提供公开、静态方法返回本类型的唯一实例
	public static Singleton getInstance() {
		return instance;
	}
	
	//其它属性....
	
	//其它方法....
}
