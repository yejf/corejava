/**
 * �������XX��˾��Ȩ����
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day14.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.core.day09.Book;

/**
 * @author ����Ǭ
 * 2016��7��20�� ����10:34:50
 */
public class BookList {
	
	private List<Book> bookList = new ArrayList<>();
	
	public BookList() {
		//
		Book b1=new Book("1001",new String[]{"Ī��"},25.6,"��");
		Book b2=new Book("1002",new String[]{"��ӹ"},15.6,"Ц������");
		Book b3=new Book("1003",new String[]{"����","Y����"},45.6,"��Խ");
		Book b4=new Book("1004",new String[]{"����","������"},69.5,"Сʱ��");
		Book b5=new Book("1001",new String[]{"��ж�"},39.9,"���μ�");
		Book b6=new Book("1002",new String[]{"��ӹ"},20.6,"����������");
		Book b7=new Book("1003",new String[]{"�޹���"},45.6,"��������");
		Book b8=new Book("1004",new String[]{"ʩ����","����"},53.5,"ˮ䰴�");
		Book b9=new Book("1003",new String[]{"��ӹ","����"},25.4,"���Ӣ�۴�");
		Book b10=new Book("1004",new String[]{"Ī��ɣ"},19.5,"��֬��");
		//��ӵ�������
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
		//�㷨
		List<Book> temp = null;
		//�������е�ͼ��
		for(Book b : bookList) {
			String[] author = b.getAuthor();
			//���ȣ��ж�map���Ƿ��Ѿ����� author���key
			for(String a : author) {
				
				if(map.containsKey(a)) {
					//˵����������Ѿ���ӵ�map��
					//ֱ��ͨ��key����ȡ value 
					temp = map.get(a);
					//�ٰ��Ȿ����ӵ� temp��list��
					temp.add(b);
				} else {
					// ˵��������ߵ�һ�γ���
					temp = new ArrayList<>(); //��ʼ�����߶�Ӧ��List
					//��book��������list��
					temp.add(b);
					//�ٰ�������ߺ�list��ӵ�map��
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
			//�ж�
			if(b.getName().contains(name)) {
				//������ӵ�����
				books.add(b);
			}
		}
		return books;
		
	}

}
