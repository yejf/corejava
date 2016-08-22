/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day14;

import java.util.Comparator;

import com.core.day09.Book;

/**
 * @author yejf
 *
 */
public class BookComparator {

	//�ṩ��������
	/****
	 * ���Ը��ݲ�ͬ���������ɲ�ͬ�ıȽϲ���
	 * @param type ����
	 * @return
	 */
	public static Comparator<Book> getComparator(int type) {
		Comparator<Book> c = null;
		// ����type���ж�
		if(type == 1) {
			//��isbn ��
			c = new Comparator<Book>() {
				
				@Override
				public int compare(Book o1, Book o2) {
					
					return o1.getIsbn().compareTo(o2.getIsbn());
				}
			};
		} else if(type == 2) {
			//��price ��
			c = new Comparator<Book>() {
				
				@Override
				public int compare(Book o1, Book o2) {
					if(o1.getPrice() > o2.getPrice()) {
						return 1;
					} else if(o1.getPrice() < o2.getPrice()) {
						return -1;
					} else {
						return 0;
					}
				}
			};
		
		} else {
			//��name ��
			c = new Comparator<Book>() {
				
				@Override
				public int compare(Book o1, Book o2) {
					return o1.getName().compareTo(o2.getName());
				}
			};
		}
		//����
		return c;
	}
}


