/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day02;

/**
 * @author yejf
 *
 */
public class VarDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������
		String msg = "Hello,Java!";
		//����˱�����ֵ
		System.out.println(msg);
		
		//
		int i = 18;
		long a = 100L;
		short s = 19;
		byte b = 12;
		//�������4�ϸ�������ֵ
		System.out.println("i = "+i);
		System.out.println("a = "+a);
		System.out.println("s = "+s);
		System.out.println("b = "+b);
		
		//
		double d = 45.67;
		float f = 34.56F; 
		System.out.println("d = "+d);
		System.out.println("f = "+f);
		
		//
		boolean bn = true;
		System.out.println("bn = "+bn);
		
		//�����ַ�����
		char c1 = '��';
		System.out.println("c1 = "+c1);
		char c2 = '\t';
		System.out.println(c2+"=>"+c1);
		char c3 = '\u6211';
		System.out.println("c3 = "+c3);
		
		//���峣��
		final int EAST = 1;
		final int WEST = 2;
		final int NORTH = 3;
		final int SOUTH = 4;
		
		
	}

}
