/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day10;

/**
 * @author yejf
 *
 */
public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//���ô��صķ�ʽ�����ַ�������ֵ
		String s1 = "hehe";
		String s2 = "hehe";
		
		System.out.println(s1 == s2);
		
		//ʹ����ͨ�ķ�ʽ�������ַ���
		String a1 = new String("jack");
		String a2 = new String("jack");
		
		System.out.println(a1 == a2);
		
		//�ѳ��洴�����ַ����Դ��صķ�ʽ���д洢
		String a3 = a1.intern();
		String a4 = a2.intern();
		
		System.out.println(a3 == a4);
	}

}
