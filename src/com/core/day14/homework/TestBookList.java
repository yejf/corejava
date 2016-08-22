/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
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
		//创建对象
		BookList list = new BookList();
		//
		double total = list.getTotalCost();
		System.out.printf("总图书数：%d\n",list.size());
		System.out.printf("所有图书总价：%.2f\n",total);
		//
		List<Book> books = list.findByName("记"); 
		//
		if(books != null && books.size() > 0) {
			for(Book b : books) {
				System.out.println(b);
			}
			System.out.printf("查到: %d\n", books.size());
		}
		//
		Map<String, List<Book>> map = list.countBookByAuthor();
		System.out.printf("共计有：%d 个作者\n",map.size());
		//迭代map
		Set<Entry<String, List<Book>>> entrys = map.entrySet();
		for(Entry<String, List<Book>> entry : entrys) {
			//
			String key = entry.getKey();
			List<Book> value = entry.getValue();
			//输出
			System.out.printf
				("作者：[%s]的书有：%d本,如下：\n\t",key,value.size());
			//
			for(Book b : value) {
				System.out.println(b);
			}
			System.out.println("-----------------------------------------");
		}
	}
}
