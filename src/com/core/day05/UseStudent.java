/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day05;

/**
 * @author yejf
 *
 */
public class UseStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//����Student����
		Student s1 = new Student();
		//ֱ��ͨ�����Ը�ֵ
//		s1.name = "jack";
//		s1.age = -9;
//		s1.gender = 'X';
		
		s1.setName("������");
		s1.study();
		
		System.out.println("--- �ָ���----");
		
		Student s2 = new Student("jack");
		s2.study();
		
		System.out.println("--- �ָ���----");
		
		Student s3 = new Student("1001", "��ʤ", '��', 19,
							new String[]{"����","д��","����"});
		s3.showHobbies();
		//�޸Ķ��������
		s3.setAge(-8);
	}

}

