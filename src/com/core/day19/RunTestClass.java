package com.core.day19;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTestClass {

	public static void main(String[] args) {
		int pass = 0; //��¼���Գɹ��ĸ���
		int failure = 0; //��¼����ʧ�ܵĸ���
		
		TestClass obj = new TestClass();
		//���÷��������� TestClass�е����з������������Щ������@Testע��
		Class<TestClass> c = TestClass.class;
		//��ȡ���з���
		Method[] methods = c.getDeclaredMethods();
		//�������з���
		for(Method m : methods) {
			//�жϴ�method�Ƿ������ @Ignore ע��
			if(m.isAnnotationPresent(Ignore.class)) {
				System.err.printf("����%s��������.\n",m.getName());
				continue;
			}
			//�жϴ�method���Ƿ������@Testע��
			if(m.isAnnotationPresent(Test.class)) {
				//����ô˷���
				try {
					m.invoke(obj);
					//�ɹ�����
					pass++;
					
				} catch (IllegalAccessException 
							| IllegalArgumentException 
								| InvocationTargetException e) {
					//ʧ�ܴ���++
					failure++;
					System.err.printf("����%sִ��ʧ��...\n",m.getName());
//					e.printStackTrace();
				}
			} else {
				//��ʾ�˷���û�д��� @Test ע��
				System.out.printf
					("\t����%s()���ᱻ����ִ��\n",m.getName());
			}
		}
		//������
		System.out.printf
			("\nɨ��ִ����ɣ��ɹ�:%d, ʧ��:%d \n",pass,failure);
	}
}

