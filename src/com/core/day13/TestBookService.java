package com.core.day13;

import com.core.day09.Book;
import com.core.day09.BookInfo;
import com.core.day10.homework.IBookService;
import com.core.util.DateUtil;

public class TestBookService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IBookService bs=new BookServiceByList();
		
		Book b1 =new Book("10001", new String[]{"A1","A0"}, 26.8, "书1");
		Book b2 =new Book("10002", new String[]{"A2","Ay"}, 26.8, "书2");
		Book b3 =new Book("10003", new String[]{"A3","Ax"}, 26.8, "书3");
		Book b4 =new Book("10004", new String[]{"A4","A3"}, 26.8, "书4");
		Book b5 =new Book("10005", new String[]{"A5","Ax"}, 26.8, "书5");
		BookInfo bi1=new BookInfo("新华",DateUtil.create(2012, 10, 12),358);
		
		BookInfo bi2 = null;
		BookInfo bi3 = null;
		try {
			bi2 = (BookInfo) bi1.clone();
			bi2.setPages(400);
			bi3 = (BookInfo) bi1.clone();
			bi3.setPages(500);
		} catch (CloneNotSupportedException e1) {
			e1.printStackTrace();
		}
		
		b1.setInfo(bi1);
		b2.setInfo(bi2);
		b3.setInfo(bi3);
		
		bs.addBook(b1);
		bs.addBook(b2);
		bs.addBook(b3);
		bs.addBook(b4);
		bs.addBook(b5);
		
		Book[] a=bs.getAllBooks();
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		System.out.println();
		
		
		/*bs.deleteByIsbn("10002");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		System.out.println();*/
		
		
		System.out.println("---- 删除作者为 Ax的图书后：");
		bs.deleteByAuthor("Ax");
		
		a = bs.getAllBooks();
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		System.out.println();
		
		//
		System.out.printf("--- 把ibsn为[%s]的图书更新后：\n",b2.getIsbn());
		try {
			Book kb2 = (Book) b2.clone();
			kb2.setName("笑傲江湖");
			bs.updateBook(kb2);
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
		Book[] b=bs.getAllBooks();
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
		
		System.out.println(bs.size());
		
	}

}
