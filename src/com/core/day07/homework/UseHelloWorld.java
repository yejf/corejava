/**
 * 本代码归xx公司版权所有
 */
package com.core.day07.homework;

/**
 * @author 陈一凡
 *
 */
public class UseHelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//面向接口编程
		IHello hw = new HelloWorld();
		hw.sayHello("jack");
	}

}
