/**
 * �������xx��˾��Ȩ����
 */
package com.core.day07.homework;

/**
 * @author ��һ��
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
