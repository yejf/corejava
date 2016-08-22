/**
 * 本代码归XX公司版权所有
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day14.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.core.day09.Book;

/**
 * @author 何子乾
 * 2016年7月20日 下午10:34:50
 */
public class BookList {
	
	private List<Book> bookList = new ArrayList<>();
	
	public BookList() {
		//
		Book b1=new Book("1001",new String[]{"莫言"},25.6,"蛙");
		Book b2=new Book("1002",new String[]{"金庸"},15.6,"笑傲江湖");
		Book b3=new Book("1003",new String[]{"黄易","Y先生"},45.6,"穿越");
		Book b4=new Book("1004",new String[]{"韩寒","郭敬明"},69.5,"小时代");
		Book b5=new Book("1001",new String[]{"吴承恩"},39.9,"西游记");
		Book b6=new Book("1002",new String[]{"金庸"},20.6,"倚天屠龙记");
		Book b7=new Book("1003",new String[]{"罗贯中"},45.6,"三国演义");
		Book b8=new Book("1004",new String[]{"施耐庵","张三"},53.5,"水浒传");
		Book b9=new Book("1003",new String[]{"金庸","张三"},25.4,"射雕英雄传");
		Book b10=new Book("1004",new String[]{"莫泊桑"},19.5,"羊脂球");
		//添加到集合中
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		bookList.add(b4);
		bookList.add(b5);
		bookList.add(b6);
		bookList.add(b7);
		bookList.add(b8);
		bookList.add(b9);
		bookList.add(b10);
	}
	
	public int size() {
		return bookList == null ? 0 : bookList.size();
	}
	
	public double getTotalCost(){
		double total = 0;
		
		for(Book b : bookList) {
			total += b.getPrice();
		}
		
		return total; 
		
	}
	
	public Map<String, List<Book>> countBookByAuthor(){
		Map<String, List<Book>> map = new HashMap<>();
		//算法
		List<Book> temp = null;
		//遍历所有的图书
		for(Book b : bookList) {
			String[] author = b.getAuthor();
			//首先，判断map中是否已经含有 author这个key
			for(String a : author) {
				
				if(map.containsKey(a)) {
					//说明这个作者已经添加到map中
					//直接通过key来获取 value 
					temp = map.get(a);
					//再把这本书添加到 temp的list中
					temp.add(b);
				} else {
					// 说明这个作者第一次出现
					temp = new ArrayList<>(); //初始化作者对应的List
					//把book添加以这个list中
					temp.add(b);
					//再把这个作者和list添加到map中
					map.put(a, temp);
				}
			}
		}
		
		return map;
	}
	
	public List<Book> findByName(String name) {
		List<Book> books = new ArrayList<>();
		//
		for(Book b : bookList) {
			//判断
			if(b.getName().contains(name)) {
				//把书添加到集合
				books.add(b);
			}
		}
		return books;
		
	}

}
