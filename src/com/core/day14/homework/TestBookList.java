/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day14.homework;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.core.day09.Book;

/**
 * @author yejf
 *
 */
public class TestBookList {

	public static void main(String[] args) {
		//��������
		BookList list = new BookList();
		//
		double total = list.getTotalCost();
		System.out.printf("��ͼ������%d\n",list.size());
		System.out.printf("����ͼ���ܼۣ�%.2f\n",total);
		//
		List<Book> books = list.findByName("��"); 
		//
		if(books != null && books.size() > 0) {
			for(Book b : books) {
				System.out.println(b);
			}
			System.out.printf("�鵽: %d\n", books.size());
		}
		//
		Map<String, List<Book>> map = list.countBookByAuthor();
		System.out.printf("�����У�%d ������\n",map.size());
		//����map
		Set<Entry<String, List<Book>>> entrys = map.entrySet();
		for(Entry<String, List<Book>> entry : entrys) {
			//
			String key = entry.getKey();
			List<Book> value = entry.getValue();
			//���
			System.out.printf
				("���ߣ�[%s]�����У�%d��,���£�\n\t",key,value.size());
			//
			for(Book b : value) {
				System.out.println(b);
			}
			System.out.println("-----------------------------------------");
		}
	}
}
