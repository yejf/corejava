package com.core.day10.homework;

import com.core.day09.Book;

public interface IBookService {
    
	void addBook(Book b); //���ͼ��
	
	void deleteByIsbn(String ibsn); //
	
	void deleteByAuthor(String author); //
	
	void updateBook(Book b); //������
	
	int size(); //ͳ���������
	
	void clear(); //�������ͼ��
	
	Book selectByIsbn(String isbn);
	
	Book[] getAllBooks(); //��ȡ����ͼ��
}
