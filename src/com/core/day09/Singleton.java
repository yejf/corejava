/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day09;

/**
 * ���ģʽ֮����ģʽ
 * @author yejf
 *
 */
public class Singleton {

	//1. ���췽��˽�л�
	private Singleton() {
		
	}
	
	//2. �ṩ˽�С���̬�ı������͵�����
	private static Singleton instance = new Singleton();
	
	//3. �ṩ��������̬�������ر����͵�Ψһʵ��
	public static Singleton getInstance() {
		return instance;
	}
	
	//��������....
	
	//��������....
}
