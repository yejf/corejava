/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day08;

/**
 * @author yejf
 *
 */
public class TestStaic {
	
	static {
		System.out.println("--- ����TestStatic���еľ�̬�����...");
		//
//		System.exit(0); //�˳�JVM����
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
			System.out.printf("ѧԱ�ţ�%d\n",s.getId());
		}
		
	}

}
