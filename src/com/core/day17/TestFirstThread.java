/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day17;

/**
 * @author yejf
 *
 */
public class TestFirstThread {

	public static void main(String[] args) {
		//获取当前线程名
		String name = Thread.currentThread().getName();
		System.out.printf("线程 %s 正在执行.\n",name);
		//创建线程对象
		Thread t = new FirstThread();
		//启动FirstThread
		t.start(); //这个线程同main线程一样，也会申请内核线程资源
		//再创建一个线程对象
		Runnable r = new MyRun();
		Thread tr = new Thread(r);
		//启动tr 线程 
		tr.start();
		
		try {
			t.join(); //main线程要等待t线程结束后再会打破阻塞
			//
			tr.join();//等待tr结束
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//在main线程中也打印10个数
		for(int i = 100;i<110;i++) {
			System.out.printf("%s 在打印 %d\n",name,i+1);
		}
		//
		System.out.printf("线程 %s 运行结束...\n",name);
	}
}

