/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day07;

/**
 * ��̬�Ĳ���
 * @author yejf
 *
 */
public class TestPolymorphism {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//��������, ����ı���ʱ���;����ܵظ���
		Shape c = new Circle("Բ��", 6.2);
		Shape r = new Rectangle("����", 5.6, 4.8);
		
		//����һ��Shape���͵�������������е���״����
		Shape[] sarr = new Shape[]{c,r};
		
		//������ͬ�ķ������鿴�����������Ϊ
		for(Shape s : sarr){
			System.out.printf("%s�����:%.2f,�ܳ�:%.2f\n",
								s.getName(),s.area(),s.girth());
		}
		
	}

}
