package com.core.day10.homework;

import com.core.day09.Book;


public class BookService implements IBookService {
	
	private Book[] bookList; 
	
	private int capacity=4;
	
	private int length=0;
	
	
	/**
	 * 
	 */
	public BookService() {
		super();
		bookList=new Book[capacity]; 
	}

	/**
	 * @return the bookList
	 */
	public Book[] getBookList() {
		return bookList;
	}

	@Override
	public void addBook(Book b) {
		//length++;
		if(capacity==length){
			extend();
		}
		bookList[length++]=b;
	}

	@Override
	public void deleteByIsbn(String isbn) {
		int i=selectByIs(isbn);
		if(i != -1) {
			deletebyI(i);
		} else {
			System.out.printf("无此图书:%s\n",isbn);
		}
	}

	@Override
	public void deleteByAuthor(String author) {
		int m=0;
		int[] do_delete_list = selectByAuthor(author);
		//[] a=Arrays.copyOf(do_delete_list, do_delete_list.length);
		
		//while(do_delete_list[m]>0){
		for(int i=0;i<do_delete_list.length;i++){
			if(do_delete_list[i] > 0) {
				//获取要删除的图书下标
				int p=do_delete_list[m]-1;
				
				deletebyI(p-m);
				
				m++;
			}
		}
		//
		System.out.printf("--- 已删除【%d】本图书, 还剩下【%d】本.\n",m,this.length);
	}

	@Override
	public void updateBook(Book b) {
		String isbn = b.getIsbn();
		if(isbn == null) {
			System.out.println("此书无唯一标识，无法更新.");
			return ;
		}
		int i=selectByIs(isbn);
		if(i != -1) {
			bookList[i]=b;
		} else {
			System.out.printf("没有找到isbn为[%s]的图书.\n",isbn);
		}
	}

	@Override
	public int size() {
		return length;
	}

	@Override
	public void clear() {
		length=0;
		capacity=4;
	}

	
	private int selectByIs(String isbn) {
		int index = -1;
		for(int i=0;i<length;i++){
			//if(bookList[i].getIsbn()==isbn){
			if(bookList[i].getIsbn().equals(isbn)){
				index = i;
				break;
			}
		}
		return index;
	}
	@Override
	public Book selectByIsbn(String isbn){
		return bookList[selectByIs(isbn)];
	}
	
	@Override
	public Book[] getAllBooks() {
		Book[] a=new Book[length];
		for(int i=0;i<length;i++){
			a[i]=bookList[i];
		}
		return a;
	}
	
	private   void extend(){
		capacity*=2;
		Book[] newlist=new Book[capacity];
		for(int i=0;i<length;i++){
			newlist[i]=bookList[i];
		}
		//setBookList(newlist);
		this.bookList = newlist;
	}
	
	private int[] selectByAuthor(String author){
		int[] a=new int[length];
		//for(int k=0;;){
		int k = 0;
			for(int i=0;i<length;i++){
				if(contain(bookList[i].getAuthor(),author)){
					a[k]=i+1;
					k++;
				}
			}
//			break;
//		}
		return a;
	}
	
	private boolean contain(String[] a,String b){
		for(int i=0;i<a.length;i++){
			if(a[i].equals(b)) return true;
		}
		return false;
	}
	
	private void deletebyI(int i){
		for(int k=i;k<length-1;k++){
			bookList[k]=bookList[k+1];
		}
		//把length处的对象清空
		length--;
		bookList[length] = null; //
	}
}
