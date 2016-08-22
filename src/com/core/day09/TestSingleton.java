/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day09;

import com.core.day08.Student;

/**
 * @author yejf
 *
 */
public class TestSingleton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//����Singleton����
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1);
		
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2);
		
		//
		System.out.println(s1 == s2);
		//
		Student stu1 = new Student("jack", 18);
		Student stu2 = new Student("jack", 18);
		System.out.println(stu1);
		System.out.println(stu2);
		
		//
		System.out.println(stu1 == stu2);
	}

}
