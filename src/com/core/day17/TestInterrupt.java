/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day17;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yejf
 *
 */
public class TestInterrupt {

	public static void main(String[] args) {
		//创建一个集合来保存所有的非main线程
		List<Thread> all = new ArrayList<>();
		//循环创建线程
		for(int i=0;i<50;i++) {
			Runnable r = new InterruptRun("小"+(i+1), 5+i);
			//创建线程并启动
			Thread t = new Thread(r);
			t.start();
			//把线程存入到集合中
			all.add(t);
		}
		//让main等待t开始执行
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		//迭代这个集合
		for(Thread t : all) {
			if(t.getName().equals("小1") 
					|| t.getName().equals("小4")) {
				System.out.printf
					("线程%s 开始给线程[%s]发中断信息.\n",
							Thread.currentThread().getName(),
							t.getName());
				//发送中断信息
				t.interrupt();
			}
		}
		// main线程等待所有的线程结束后，才结束
		for(Thread t : all) {
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.printf("main线程结束了..\n");
	}
}
