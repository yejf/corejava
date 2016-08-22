/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day17;

/**
 * @author yejf
 *
 */
public class IntegerRun implements Runnable {
	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			//依次打印输出绑定在local中的值
			System.out.printf("%s -> %d\n", 
					Thread.currentThread().getName(),
					IntegerThreadLocal.getInt());
		}
	}

}
