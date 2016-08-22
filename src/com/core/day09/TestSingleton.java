/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
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
		//创建Singleton对象
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
