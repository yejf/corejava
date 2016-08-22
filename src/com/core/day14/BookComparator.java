/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day14;

import java.util.Comparator;

import com.core.day09.Book;

/**
 * @author yejf
 *
 */
public class BookComparator {

	//提供工厂方法
	/****
	 * 可以根据不同的类型生成不同的比较策略
	 * @param type 类型
	 * @return
	 */
	public static Comparator<Book> getComparator(int type) {
		Comparator<Book> c = null;
		// 根据type做判断
		if(type == 1) {
			//按isbn 比
			c = new Comparator<Book>() {
				
				@Override
				public int compare(Book o1, Book o2) {
					
					return o1.getIsbn().compareTo(o2.getIsbn());
				}
			};
		} else if(type == 2) {
			//按price 比
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
			//按name 比
			c = new Comparator<Book>() {
				
				@Override
				public int compare(Book o1, Book o2) {
					return o1.getName().compareTo(o2.getName());
				}
			};
		}
		//返回
		return c;
	}
}


