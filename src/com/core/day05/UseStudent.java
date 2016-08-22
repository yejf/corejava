/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
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
		//创建Student对象
		Student s1 = new Student();
		//直接通过属性赋值
//		s1.name = "jack";
//		s1.age = -9;
//		s1.gender = 'X';
		
		s1.setName("马来来");
		s1.study();
		
		System.out.println("--- 分割线----");
		
		Student s2 = new Student("jack");
		s2.study();
		
		System.out.println("--- 分割线----");
		
		Student s3 = new Student("1001", "金胜", '男', 19,
							new String[]{"看书","写字","音乐"});
		s3.showHobbies();
		//修改对象的属性
		s3.setAge(-8);
	}

}

