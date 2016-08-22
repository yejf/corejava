/**
 * 
 */
package com.core.day17.homework;

/**
 * @author Jin
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object lock = new Object();
		// 启动两个线程
		Thread_1 t1 = new Thread_1(lock);
		Thread_2 t2 = new Thread_2(lock);
		//修改优先级
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		
		t2.setPriority(Thread.NORM_PRIORITY);
		t2.start();
	}

}
