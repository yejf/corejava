/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day14.homework;

/**
 * 
 * @author ����Ǭ
 * 2016��7��20�� ����9:26:58
 */
public class TestVarArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//����VarArray����
		VarArray<Integer> va = new VarArray<>();
		//ѭ���������
		va.add(49);
		va.add(66);
		va.add(78);
		va.add(55);
		//
		va.showAllElement();
		//
		va.remove(66);
		System.out.printf("��ǰ����ЧԪ�ظ�����%d\n",va.length());
		va.showAllElement();
		
		va.update(0, 100);
		va.showAllElement();
		//����������Ϊ�ַ�������
		VarArray<String> va2 = new VarArray<>();
		va2.add("start");
		va2.add("end");
		va2.add("process");
		va2.add("result");
		va2.showAllElement();
		va2.remove("process");
		System.out.printf("��ǰ����ЧԪ�ظ�����%d\n",va2.length());
		va2.showAllElement();
		
		}
	}


