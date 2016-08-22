/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
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
	//��Ӹ����ϵ�����
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
		//���ò�ѯ�ķ���
		Book b = selectByIsbn(isbn);
		//
		if(b != null) {
			this.datas.remove(b);
 		} else { 
			System.out.printf("���޴�ͼ��:%s\n",isbn);
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
				temp.add(book); //ÿ�ҵ�һ��������ӵ�������
			}
		}
		//
		if(temp.size() != 0) {
			//˵���ҵ���
			this.datas.removeAll(temp);
			
		} else {
			System.out.printf("û���ҵ�[%s]����\n",author);
		}
	}

	/* (non-Javadoc)
	 * @see com.core.day10.homework.IBookService#updateBook(com.core.day09.Book)
	 */
	@Override
	public void updateBook(Book b) {
		//�����Ȿ���isbn ���ҵ�ԭ�����Ǳ���
		Book book = selectByIsbn(b.getIsbn());
		//�ж� book �Ƿ�Ϊnull
		if(book == null) {
			System.out.printf("�����ڴ�ͼ�飺%s\n",b.getIsbn());
		} else {
			//������ indexOf���������±�
			int index = this.datas.indexOf(book);
			//����
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
		//����һ������
		Book[] books = new Book[this.datas.size()];
		return this.datas.toArray(books);
	}

}
