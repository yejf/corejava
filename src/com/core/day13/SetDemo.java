/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
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
		//创建Set对象
		Set<Book> bookSet = new HashSet<>();
		//创建Book对象
		Book b1 = new Book("1001", new String[]{"莫言"}, 25.6, "蛙");
		Book b2 = new Book("1002", new String[]{"金庸"}, 15.6, "笑傲江湖");
		Book b3 = new Book("1003", new String[]{"黄易","Y先生"}, 45.6, "穿越");
		Book b4 = new Book("1004", new String[]{"韩寒","郭敬明"}, 19.6, "小时代");
		
		bookSet.add(b1);
		bookSet.add(b2);
		bookSet.add(b3);
		bookSet.add(b4);
		
		//输出
		for(Book b : bookSet){
			System.out.println(b);
		}
		System.out.println("共计："+bookSet.size());
		
		Book b5 = new Book("1004", new String[]{"韩寒","郭敬明"}, 69.5, "小时代");
		//不重复
		if(bookSet.add(b5)) { //添加不进去
			System.out.println("添加b5成功..");
		} else {
			System.out.println("添加b5失败...");
		}
		
		System.out.println(">>> 添加b5之后：");
		System.out.println("共计："+bookSet.size());
		// 
		Iterator<Book> iter = bookSet.iterator();
		while(iter.hasNext()) {
			Book b = iter.next();
			System.out.println(b);
		}
		
	}
}

