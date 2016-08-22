/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day08;

/**
 * @author yejf
 *
 */
public class TestStaic {
	
	static {
		System.out.println("--- 我是TestStatic类中的静态代码块...");
		//
//		System.exit(0); //退出JVM进程
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student[] sarr = new Student[1000];
		
		for (int i = 0; i < sarr.length; i++) {
			sarr[i] = new Student();
			
		}
		//...
		for(Student s : sarr){
			System.out.printf("学员号：%d\n",s.getId());
		}
		
	}

}
