/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day12;

/**
 * @author yejf
 *
 */
public class TestEnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//��ȡGender��һ��ö�ٳ���
		Gender m = Gender.MALE;
		System.out.println(m); //�൱��m.toString();
		
		//���Ҫ��ȡ���ö�ٵ����г���
		Gender[] all = Gender.values(); 
		for(Gender g : all) {
			System.out.printf
				("ö�ٳ�����:%s, ���:%d\n",g, g.ordinal());
		}
	}

}
