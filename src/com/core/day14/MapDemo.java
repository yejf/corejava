/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.core.day09.Book;

/**
 * @author yejf
 *
 */
public class MapDemo {

	public static void main(String[] args) {
		// 创建一个Map
		Map<String, Book> map = new HashMap<>();
		// 模拟 4本书
		Book b1 = new Book("1001", new String[] { "莫言" }, 25.6, "蛙");
		Book b2 = new Book("1002", new String[] { "金庸" }, 15.6, "笑傲江湖");
		Book b3 = new Book("1003", new String[] { "黄易", "Y先生" }, 45.6, "穿越");
		Book b4 = new Book("1004", new String[] { "韩寒", "郭敬明" }, 19.6, "小时代");
		//把图书添加到 map中
		map.put(b1.getIsbn(), b1);
		map.put(b2.getIsbn(), b2);
		map.put(b3.getIsbn(), b3);
		map.put(b4.getIsbn(), b4);
		//
		System.out.printf("当前map的大小：%d\n",map.size());
		//迭代这个map
		showMap_1(map);
		System.out.println("=====================");
		
		showMap_2(map);
	}
	
	//使用 entrySet 来迭代
	private static void showMap_2(Map<String, Book> map) {
		Set<Map.Entry<String, Book>> entrys = map.entrySet();
		//迭代
		for(Map.Entry<String, Book> entry : entrys) {
			//获取key和value
			String key = entry.getKey();
			Book value = entry.getValue();
			//输出
			System.out.printf("key:%s \n value: %s\n",key,value);
		}
		
	}
	//使用 keySet 来迭代
	private static void showMap_1(Map<String, Book> map) {
		Set<String> keys = map.keySet();
		//使用迭代器
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			//获取key
			String key = iter.next();
			//通过key获取 value
			Book value = map.get(key);
			//输出
			System.out.printf("key:%s \n value: %s\n",key,value);
		}
	}
}
