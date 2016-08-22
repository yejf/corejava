/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.core.day09.Book;

/**
 * @author yejf
 *
 */
public class SetDemo {

	public static void main(String[] args) {
		//����Set����
		Set<Book> bookSet = new HashSet<>();
		//����Book����
		Book b1 = new Book("1001", new String[]{"Ī��"}, 25.6, "��");
		Book b2 = new Book("1002", new String[]{"��ӹ"}, 15.6, "Ц������");
		Book b3 = new Book("1003", new String[]{"����","Y����"}, 45.6, "��Խ");
		Book b4 = new Book("1004", new String[]{"����","������"}, 19.6, "Сʱ��");
		
		bookSet.add(b1);
		bookSet.add(b2);
		bookSet.add(b3);
		bookSet.add(b4);
		
		//���
		for(Book b : bookSet){
			System.out.println(b);
		}
		System.out.println("���ƣ�"+bookSet.size());
		
		Book b5 = new Book("1004", new String[]{"����","������"}, 69.5, "Сʱ��");
		//���ظ�
		if(bookSet.add(b5)) { //��Ӳ���ȥ
			System.out.println("���b5�ɹ�..");
		} else {
			System.out.println("���b5ʧ��...");
		}
		
		System.out.println(">>> ���b5֮��");
		System.out.println("���ƣ�"+bookSet.size());
		// 
		Iterator<Book> iter = bookSet.iterator();
		while(iter.hasNext()) {
			Book b = iter.next();
			System.out.println(b);
		}
		
	}
}

