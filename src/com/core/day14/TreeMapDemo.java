package com.core.day14;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import com.core.day09.Book;

/****
 * 
 * @author yejf
 *
 */
public class TreeMapDemo {

	public static void main(String[] args) {
		// ����TreeMap
		SortedMap<String, Book> map = new TreeMap<>();
		// ģ�� 4����
		Book b1 = new Book("1001", new String[] { "Ī��" }, 25.6, "��");
		Book b2 = new Book("1002", new String[] { "��ӹ" }, 15.6, "Ц������");
		Book b3 = new Book("1003", new String[] { "����", "Y����" }, 45.6, "��Խ");
		Book b4 = new Book("1004", new String[] { "����", "������" }, 19.6, "Сʱ��");
		// ��ͼ����ӵ�map��
		map.put(b1.getIsbn(), b1);
		map.put(b2.getIsbn(), b2);
		map.put(b3.getIsbn(), b3);
		map.put(b4.getIsbn(), b4);

		//
		System.out.println(map.size());
		// ���
		showMap_1(map);
		
		System.out.println("===========================");
		
		Scanner sc = new Scanner(System.in);
		System.out.print
				("�������������\n\t[1->isbn,2->price,3->name]>");
		int type = sc.nextInt();
		
//		SortedSet<Book> books = new TreeSet<>();
		//����һ�����Ƚ����� TreeSet
		
		SortedSet<Book> books = 
				new TreeSet<>(BookComparator.getComparator(type));
		//��ͼ����ӵ���set��
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		//
		System.out.println(books.size());
		//�����
		for(Book b : books) {
			System.out.println(b);
		}
		//
		sc.close();
	}

	// ʹ�� keySet ������
	private static void showMap_1(Map<String, Book> map) {
		Set<String> keys = map.keySet();
		// ʹ�õ�����
		Iterator<String> iter = keys.iterator();
		while (iter.hasNext()) {
			// ��ȡkey
			String key = iter.next();
			// ͨ��key��ȡ value
			Book value = map.get(key);
			// ���
			System.out.printf("key:%s \n value: %s\n", key, value);
		}
	}
}

