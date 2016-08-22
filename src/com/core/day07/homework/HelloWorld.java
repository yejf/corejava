/**
 * 本代码归xx公司版权所有
 */
package com.core.day07.homework;

/**
 * @author 陈一凡
 *
 */
public class HelloWorld implements IHello {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.core.day07.homework.IHello#sayHello(java.lang.String)
	 */
	@Override
	public void sayHello(String name) {
		System.out.printf("Hello,%s\n", name);
	}

}
