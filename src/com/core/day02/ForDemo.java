/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day02;

/**
 * @author yejf
 *
 */
public class ForDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//ѭ��5��
		for (int i = 0; i < 5; i++) {
			System.out.println("i = "+i);
		}
		//����
		for (int i = 4; i >= 0 ; i--) {
			System.out.println("i = "+i);
		}
		//
		System.out.println("---�ָ���---");
		//���9*9�����
		for(int i=1;i<=9;i++){
			//
			for(int j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+i*j+" ");
			}
			System.out.println();
		}
		
	}

}
