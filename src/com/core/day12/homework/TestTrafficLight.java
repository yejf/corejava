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
		System.out.println("�ӽ�·���̵�״��:");
		//
		while(true) {
			//ģ��ͣ��10����
			/*if(current == TrafficLight.YELLOW){
				System.out.printf("��ǰ�ǣ�%s\n",current);
				for(int i=3;i>=1;i--){
					try {
						System.out.printf("\r�Ƶƣ���ȴ�%-2d ��",i-1);
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("\n================");
			}else{
				System.out.printf("��ǰ�ǣ�%s\n",current);
				for(int i=15;i>=1;i--){
					try {
						System.out.printf("\r%s����ȴ�%-2d ��",current,i-1);
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
