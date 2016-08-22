/**
 * 
 */
package com.core.day17.homework;

/**
 * @author Jin
 *
 */
public class Thread_2 extends Thread {
	private Object lock;

	/**
	 * @param obj
	 */
	public Thread_2(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		synchronized (lock) {
			for (int i = 0; i < 26; i++) {
				System.out.print((char) (('A') + i));
				lock.notify();
				try {
					if(i != 25) {
						lock.wait();
						sleep(500);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
