/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day17;

/**
 * @author yejf
 *
 */
public class MyRun implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		//在此填写被线程执行的代码
		String name = Thread.currentThread().getName();
		System.out.printf("线程:%s 开始执行...\n",name);
		//
		for(int i = 50;i<100;i+=10) {
			System.out.printf("线程%s 打印 %d\n", name, i);
		}
		//
		System.out.printf("线程%s 结束.\n",name);
	}
	
}

