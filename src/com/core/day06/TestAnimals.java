/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day06;

/**
 * @author yejf
 *
 */
public class TestAnimals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//����һֻС��
		Bird b = new Bird("����", false);
		//���ø���ķ���
		b.shout();
		//Ҳ���Ե����Լ��ķ���
		b.fly();
		
		System.out.println("-------�ָ���----------");
		//���� Dog����
		Dog d = new Dog("�ǹ�", 22);
		//���ø���ķ���
		d.shout();
		//Ҳ���Ե����Լ��ķ���
		d.eatBone();
	}

}
