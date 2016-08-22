/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day08;

/**
 * @author yejf
 *
 */
public class Student {

	private int id; //编号, 由内部产生，自动增长
	
	private String name;
	
	private int age;

	//提供一个静态属性计数器
	private static int index; //全局变量/类变量，从1开始
	
	public Student() {
		super();
		//自动产生ID
		this.id = index++;
		//
		System.out.println("--哦哦，我是构造方法...");
	}
	
	//普通代码块, 每创建一次对象，就调用一次。
	{
		System.out.println("--呵呵，我是普通代码块...");
	}
	
	//在类加载时被 调用1次。
	static {
		System.out.println(">>>嗯，我可是静态代码块哦....");
		//给静态属性赋值
		index = 1;
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		//自动产生ID
		this.id = index++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}
	
}

