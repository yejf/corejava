/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day12;

/**
 * @author yejf
 *
 */
public class Outer {

	//����
	private int index = 150;
	
	private String message; 
	
	private static int i = 100;
	
	//��̬�ڲ���
	public static class Inner {
		//����
		private int index; //����������ͬ�ⲿ��һ����
		
		//����
		public void print() {
			System.out.println(this.index); //�Լ���
			System.out.println(Outer.i); //�ⲿ��ľ�̬����
//			System.out.println(message); //���ܷ��ʷǾ�̬��Ա
		}
	}
	
	//����
	public void localMethod() {
		System.out.println("...ִ���ⲿ���localMethod����...");
		final int index = 200; //����
		//�ֲ��ڲ���
		/*class DNA implements Spider {
			@Override
			public void run() {
				//�����ⲿ������г�Ա
				System.out.println("\t>>>�ֲ����� "+index); //�ֲ�����
				System.out.println("\t>>>�ⲿ�����ԣ�"+Outer.this.index);//�ⲿ������
				
			}
		}
		//Ҫ��������ڲ���Ķ���
		Spider s = new DNA();
		//�ٵ���s�ķ���
		System.out.println(" >>> ���þֲ��ڲ���ķ���");
		s.run();*/
		
		System.out.println(" >>> ���þֲ��ڲ���ķ���");
		//��д�������ڲ���
		new Spider() {
			@Override
			public void run() {
				//�����ⲿ������г�Ա
				System.out.println("\t>>>�ֲ����� "+index); //�ֲ�����
				System.out.println("\t>>>�ⲿ�����ԣ�"+Outer.this.index);//�ⲿ������
			}
		}.run();
		
		//
		//...
		System.out.println("... �ص��ⲿ���localMethod������...");
	}
}
