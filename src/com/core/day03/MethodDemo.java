/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day03;

/**
 * @author yejf
 *
 */
public class MethodDemo {

	/**
	 * ������,Ҳ���ǳ�������
	 * @param args
	 */
	public static void main(String[] args) {
		//����MethodDemo����
		MethodDemo md = new MethodDemo();
		//����sayHello����
		md.sayHello("������");
		
		System.out.println("=====�ָ���======");
		//���� getName����
		String result = md.getName();
		//ע���õ������Ľ������һ�����Ǵ�ӡ�����������Ϊ��һ������������
//		System.out.println(result);
		md.sayHello(result);
	}

	/****
	 * ��ȡ�����ķ���
	 * @return ����һ������
	 */
	public String getName(){
		//������������ʵ�ָ�Ϊ���ӵ��߼�
		//...
		String name = "������";
//		System.out.println(name);
		return name;
	}
	
	/******
	 * ���к��ķ���
	 * @param name
	 */
	public void sayHello(String name){
		//ͬ������������ʵ�ָ�Ϊ���ӵ��߼�
		//...
		System.out.println("���,"+name);
	}
}




