/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day08;

/**
 * @author yejf
 *
 */
public class Student {

	private int id; //���, ���ڲ��������Զ�����
	
	private String name;
	
	private int age;

	//�ṩһ����̬���Լ�����
	private static int index; //ȫ�ֱ���/���������1��ʼ
	
	public Student() {
		super();
		//�Զ�����ID
		this.id = index++;
		//
		System.out.println("--ŶŶ�����ǹ��췽��...");
	}
	
	//��ͨ�����, ÿ����һ�ζ��󣬾͵���һ�Ρ�
	{
		System.out.println("--�Ǻǣ�������ͨ�����...");
	}
	
	//�������ʱ�� ����1�Ρ�
	static {
		System.out.println(">>>�ţ��ҿ��Ǿ�̬�����Ŷ....");
		//����̬���Ը�ֵ
		index = 1;
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		//�Զ�����ID
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

