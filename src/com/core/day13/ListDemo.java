/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author yejf
 *
 */
public class ListDemo {

	public static void main(String[] args) {
		//����һ��List����
		List strList = new ArrayList();
		//û��ʹ�÷���ǰ����������п��Է����� ���͵Ķ���
		strList.add("������");
		strList.add("���ľ�");
		strList.add("���");
		strList.add("����");
		//�鿴��ǰ������Ԫ�صĸ���
		System.out.printf("������Ԫ�صĸ�����%d\n",strList.size());
		strList.add("������");
		System.out.printf("������Ԫ�صĸ�����%d\n",strList.size());
		//�Ƴ�
		String obj = (String) strList.remove(1);//
		
		System.out.printf("%s ���ƶ���.\n",obj);
		System.out.printf("������Ԫ�صĸ�����%d\n",strList.size());
		if(strList.remove("����")){
			System.out.printf("%s ���Ƴ���.\n","����");
		}
		System.out.printf("������Ԫ�صĸ�����%d\n",strList.size());
		
		//
		strList.set(2, "������"); //�޸�
		
		System.out.println("--- ʹ��foreach��ǿforѭ��������");
		//����
		for(Object o : strList) {
			System.out.printf("%s\n", o);
		}
		
		System.out.println("--- ʹ�õ�����������");
		//1.��ȡ������
		Iterator iter = strList.iterator();
		while(iter.hasNext()) {
			//
			String o = (String) iter.next(); //ȡ��Ԫ��
			System.out.printf("%s\n",o);
		}
		//
		strList.clear(); //�������Ԫ��
		System.out.printf("������Ԫ�صĸ�����%d\n",strList.size());
		
	}
}
