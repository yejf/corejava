/**
 * 
 */
package com.core.day12.homework;



/**
 * @author HQ
 *
 */
public class TestTrafficLight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrafficLight current = TrafficLight.RED;
		System.out.println("赣江路红绿灯状况:");
		//
		while(true) {
			//模拟停留10秒钟
			/*if(current == TrafficLight.YELLOW){
				System.out.printf("当前是：%s\n",current);
				for(int i=3;i>=1;i--){
					try {
						System.out.printf("\r黄灯，请等待%-2d 秒",i-1);
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("\n================");
			}else{
				System.out.printf("当前是：%s\n",current);
				for(int i=15;i>=1;i--){
					try {
						System.out.printf("\r%s，请等待%-2d 秒",current,i-1);
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println();
			}*/
			
			current = current.next();
		}
	}

}
