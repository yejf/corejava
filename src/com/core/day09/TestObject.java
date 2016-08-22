/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day09;

import com.core.util.DateUtil;

/**
 * @author yejf
 *
 */
public class TestObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Book b1 = new Book("10512301", 
					new String[]{"Ī��"}, 26.8, "��");
		//
		System.out.println(b1); //�൱�ڵ����� b1.toString() ����
		
		Book b2 = new Book("10512301", 
				new String[]{"Ī��"}, 26.8, "��");
		//����һ��ͼ����ϸ
		BookInfo bi = new BookInfo("�»�������", 
				DateUtil.create(2012, 10, 12), 358);
		//�Ѵ���ϸ��Ӹ�b2
		b2.setInfo(bi);
		
		System.out.printf("b1==b2? %b\n",b1 == b2);
		System.out.printf("b1.equals(b2)? %b\n",b1.equals(b2));
		//
		System.out.println(b2); // toString
		
		//��¡����
		try {
			Book b3 = (Book) b2.clone();
			System.out.println(b3 == b2); //false
			
			//�����޸� b3��name,�����᲻��Ӱ��b2��name
			b3.setAuthor(new String[]{"jack","rose"});
			//
			System.out.printf("b3: %s\n",b3);
			System.out.printf("b2: %s\n",b2);
			System.out.println("------ �ָ��� ---------");
			
			//�����޸�b3��bookinfo���ԣ��ٿ��᲻��Ӱ��b2  
			b3.getInfo().setPublisher("���ĳ�����");
			b3.getInfo().setPages(100);
			
			System.out.printf("b3: %s\n",b3);
			System.out.printf("b2: %s\n",b2);
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		Book b4 = b2; //������ǿ�¡������ǵ�ַ��ֵ��
		System.out.println(b4 == b2);
	}

}


