/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day02;

/**
 * @author yejf
 *
 */
public class OperartorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'A';
		char c2 = 'a';
		
		int i1 = c1;
		int i2 = c2; //��ʽת��
		
		System.out.println("i1 = "+i1);
		System.out.println("i2 = "+i2);
		
		i1 += 2;
		i2++;
		
		c1 = (char)i1; //ǿ��ת��
		c2 = (char)i2;
		
		System.out.println("c1 = "+c1);
		System.out.println("c2 = "+c2);
	}

}
