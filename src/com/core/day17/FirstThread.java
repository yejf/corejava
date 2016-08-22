/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day17;

/**
 * 线程类 
 * @author yejf
 *
 */
public class FirstThread extends Thread {

	//重写run方法
	@Override
	public void run() {
		//填写线程需要执行的代码
		//...
		String tname = getName();
		System.out.printf("线程名:%s,线程ID：%d\n",tname,getId());
		//
		for(int i=0;i<10;i++) {
			//yield();
			System.out.printf("%s 打印 %d\n",tname,i+1);
		}
		//
		System.out.printf("线程 %s 结束\n",tname);
	}
}


