/**
 * 
 */
package com.core.day17.homework;

/**
 * @author Jin
 *
 */
public class Thread_1 extends Thread {
	
	private Object lock;

	/**
	 * @param obj
	 */
	public Thread_1(Object obj) {
		this.lock = obj;
	}
	@Override
	public void run() {
		//加锁
		synchronized (lock) {
			//打印1-52
			for (int i = 1; i < 53; i++) {
				System.out.print(i);
				if(i%2==0){
					//唤醒别的线程
					lock.notify(); //
					try {
						if(i != 52) {
							lock.wait(); //会释放对象的互斥锁资源
							sleep(500);
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

}
