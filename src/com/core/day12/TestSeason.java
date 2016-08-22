/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day12;

/**
 * @author yejf
 *
 */
public class TestSeason {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Season[] all = Season.values();
		
		for(Season s : all) {
			System.out.printf("常量值:%s,序号：%d\n",s, s.ordinal());
		}
		System.out.println("=======================");
		
		Season current = Season.SUMMER;
		//
		while(true) {
			System.out.printf("当前季节：%s\n",current);
			//模拟停留10秒钟
			for(int i=0;i<10;i++){
				try {
					System.out.printf("\r时间在流逝...%-2d",i+1);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println();
			//进入下一个季节
			current = current.next();
		}
		
	}

}
