/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day05.homework;

/**
 * @author yejf
 *
 */
public class TestVarArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//����VarArray����
		VarArray va = new VarArray();
		//ѭ���������
		for(int i=0;i<18;i++){
			va.add(i+1);
			System.out.printf("��ǰ����ЧԪ�ظ�����%d\n",va.length());
		}
		//
		va.showAllElement();
		//
		va.remove(10);
		System.out.printf("��ǰ����ЧԪ�ظ�����%d\n",va.length());
		va.showAllElement();
		
		va.update(5, 100);
		va.showAllElement();
		
		//����������������
		for(int i=0;i<va.length();i++){
			System.out.printf("%-4d",va.get(i));
		}
	}

}
