/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day17;

/**
 * @author yejf
 *
 */
public class InterruptRun implements Runnable {
	
	//属性
	private String name; //线程名
	private long time; //模拟睡的时间
	
	//构造方法
	public InterruptRun(String name, long time) {
		super();
		this.name = name;
		this.time = time;
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		//重设线程名
		Thread.currentThread().setName(this.name);
		//
		for (int i = 0; i < time; i++) {
			try {
				Thread.sleep(1000);
				System.out.printf("\t%s -> %d\n",this.name,i+1);
				
			} catch (InterruptedException e) {
				//e.printStackTrace();
				System.out.printf("\n线程【%s】被中断了\n",this.name);
				// 退出循环
				break;
			}
		}
		System.out.printf("\n线程[%s] 结束.\n",this.name);
	}

}
