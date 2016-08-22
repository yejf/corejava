/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.core.day09.Book;
import com.core.day10.homework.IBookService;

/**
 * @author yejf
 *
 */
public class BookServiceByList implements IBookService {
	//添加个集合的属性
	private List<Book> datas;

	public BookServiceByList() {
		// TODO Auto-generated constructor stub
		this.datas = new LinkedList<>();
	}
	
	/* (non-Javadoc)
	 * @see com.core.day10.homework.IBookService#addBook(com.core.day09.Book)
	 */
	@Override
	public void addBook(Book b) {
		this.datas.add(b);
	}

	/* (non-Javadoc)
	 * @see com.core.day10.homework.IBookService#deleteByIsbn(java.lang.String)
	 */
	@Override
	public void deleteByIsbn(String isbn) {
		//调用查询的方法
		Book b = selectByIsbn(isbn);
		//
		if(b != null) {
			this.datas.remove(b);
 		} else { 
			System.out.printf("查无此图书:%s\n",isbn);
		}
	}

	/* (non-Javadoc)
	 * @see com.core.day10.homework.IBookService#deleteByAuthor(java.lang.String)
	 */
	@Override
	public void deleteByAuthor(String author) {
		//
		List<Book> temp = new ArrayList<>();
		for(Book book : this.datas) {
			if(Arrays.toString(book.getAuthor()).contains(author)) {
				temp.add(book); //每找到一本，就添加到集合中
			}
		}
		//
		if(temp.size() != 0) {
			//说明找到了
			this.datas.removeAll(temp);
			
		} else {
			System.out.printf("没有找到[%s]的书\n",author);
		}
	}

	/* (non-Javadoc)
	 * @see com.core.day10.homework.IBookService#updateBook(com.core.day09.Book)
	 */
	@Override
	public void updateBook(Book b) {
		//根据这本书的isbn 来找到原来的那本书
		Book book = selectByIsbn(b.getIsbn());
		//判断 book 是否为null
		if(book == null) {
			System.out.printf("不存在此图书：%s\n",b.getIsbn());
		} else {
			//再利用 indexOf方法来找下标
			int index = this.datas.indexOf(book);
			//更新
			this.datas.set(index, b);
		}
	}

	/* (non-Javadoc)
	 * @see com.core.day10.homework.IBookService#size()
	 */
	@Override
	public int size() {
		return this.datas.size();
	}

	/* (non-Javadoc)
	 * @see com.core.day10.homework.IBookService#clear()
	 */
	@Override
	public void clear() {
		this.datas.clear();
	}

	/* (non-Javadoc)
	 * @see com.core.day10.homework.IBookService#selectByIsbn(java.lang.String)
	 */
	@Override
	public Book selectByIsbn(String isbn) {
		Book book = null;
		for(Book b : this.datas	) {
			if(b.getIsbn().equals(isbn)) {
				book = b;
				break;
			}
		}
		return book;
	}

	/* (non-Javadoc)
	 * @see com.core.day10.homework.IBookService#getAllBooks()
	 */
	@Override
	public Book[] getAllBooks() {
		//定义一个数组
		Book[] books = new Book[this.datas.size()];
		return this.datas.toArray(books);
	}

}
