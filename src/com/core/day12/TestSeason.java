/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
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
			System.out.printf("����ֵ:%s,��ţ�%d\n",s, s.ordinal());
		}
		System.out.println("=======================");
		
		Season current = Season.SUMMER;
		//
		while(true) {
			System.out.printf("��ǰ���ڣ�%s\n",current);
			//ģ��ͣ��10����
			for(int i=0;i<10;i++){
				try {
					System.out.printf("\rʱ��������...%-2d",i+1);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println();
			//������һ������
			current = current.next();
		}
		
	}

}
