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
		// 创建TreeMap
		SortedMap<String, Book> map = new TreeMap<>();
		// 模拟 4本书
		Book b1 = new Book("1001", new String[] { "莫言" }, 25.6, "蛙");
		Book b2 = new Book("1002", new String[] { "金庸" }, 15.6, "笑傲江湖");
		Book b3 = new Book("1003", new String[] { "黄易", "Y先生" }, 45.6, "穿越");
		Book b4 = new Book("1004", new String[] { "韩寒", "郭敬明" }, 19.6, "小时代");
		// 把图书添加到map中
		map.put(b1.getIsbn(), b1);
		map.put(b2.getIsbn(), b2);
		map.put(b3.getIsbn(), b3);
		map.put(b4.getIsbn(), b4);

		//
		System.out.println(map.size());
		// 输出
		showMap_1(map);
		
		System.out.println("===========================");
		
		Scanner sc = new Scanner(System.in);
		System.out.print
				("请输入排序规则\n\t[1->isbn,2->price,3->name]>");
		int type = sc.nextInt();
		
//		SortedSet<Book> books = new TreeSet<>();
		//创建一个带比较器的 TreeSet
		
		SortedSet<Book> books = 
				new TreeSet<>(BookComparator.getComparator(type));
		//把图书添加到此set中
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		//
		System.out.println(books.size());
		//输出：
		for(Book b : books) {
			System.out.println(b);
		}
		//
		sc.close();
	}

	// 使用 keySet 来迭代
	private static void showMap_1(Map<String, Book> map) {
		Set<String> keys = map.keySet();
		// 使用迭代器
		Iterator<String> iter = keys.iterator();
		while (iter.hasNext()) {
			// 获取key
			String key = iter.next();
			// 通过key获取 value
			Book value = map.get(key);
			// 输出
			System.out.printf("key:%s \n value: %s\n", key, value);
		}
	}
}

