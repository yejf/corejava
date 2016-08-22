package com.core.day10.homework;

import com.core.day09.Book;

public interface IBookService {
    
	void addBook(Book b); //添加图书
	
	void deleteByIsbn(String ibsn); //
	
	void deleteByAuthor(String author); //
	
	void updateBook(Book b); //附加题
	
	int size(); //统计书的数量
	
	void clear(); //清空所有图书
	
	Book selectByIsbn(String isbn);
	
	Book[] getAllBooks(); //获取所有图书
}
