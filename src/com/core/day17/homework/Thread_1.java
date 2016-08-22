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
		//����
		synchronized (lock) {
			//��ӡ1-52
			for (int i = 1; i < 53; i++) {
				System.out.print(i);
				if(i%2==0){
					//���ѱ���߳�
					lock.notify(); //
					try {
						if(i != 52) {
							lock.wait(); //���ͷŶ���Ļ�������Դ
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
