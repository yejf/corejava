/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day09;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author yejf
 *
 */
public class Book implements Cloneable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4418515545706778579L;
	//属性
	private int id; //标识
	private String isbn; // 
	private String[] author; //作者
	private double price; //单价
	private String name; //书名
//	private transient String name; //书名
	
	private BookInfo info; //图书明细

	/**
	 * 
	 */
	public Book() {
		super();
	}

	/**
	 * @param isbn
	 * @param author
	 * @param price
	 * @param name
	 */
	public Book(String isbn, String[] author, double price, String name) {
		super();
		this.isbn = isbn;
		this.author = author;
		this.price = price;
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the author
	 */
	public String[] getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String[] author) {
		this.author = author;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the info
	 */
	public BookInfo getInfo() {
		return info;
	}

	/**
	 * @param info the info to set
	 */
	public void setInfo(BookInfo info) {
		this.info = info;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [id=").append(id).append(", isbn=")
				.append(isbn).append(", author=")
				.append(Arrays.toString(author)).append(", price=")
				.append(price).append(", name=").append(name).append("]");
		//判断bookinfo是否为null
		if(info != null){
			builder.append("\n\t").append(info); //info.toString()
		}else{
			builder.append("\n\t无明细");
		}
		builder.append("\n");
		return builder.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(author);
		result = prime * result + id;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (!Arrays.equals(author, other.author))
			return false;
		if (id != other.id)
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//return super.clone();
		//深copy 的实现
		Book nb = new Book();
		//依次把所有的属性都复制一份
		nb.id = this.id; //基本类型直接赋值
		if(this.author != null){
			nb.author = Arrays.copyOf(author, author.length);
		}
		if(this.isbn != null){
			nb.isbn = new String(isbn); //重新创建新的
		}
		if(this.name != null){
			nb.name = new String(name);
		}
		nb.price = this.price;
		//考虑 info
		if(this.info != null){
			nb.info = (BookInfo) this.info.clone();
		}
		//
		return nb;
	}
	
	
}
