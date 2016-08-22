/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day09;

import java.util.Date;

/**
 * @author yejf
 *
 */
public class BookInfo implements Cloneable{

	// 属性
	private String publisher; // 出版社
	private Date publish_date; // 出版日期
	private int pages; // 页码
	private String image_url; // 封面

	public BookInfo() {
		super();
	}

	/**
	 * @param publisher
	 * @param publish_date
	 * @param pages
	 */
	public BookInfo(String publisher, Date publish_date, int pages) {
		super();
		this.publisher = publisher;
		this.publish_date = publish_date;
		this.pages = pages;
	}

	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * @param publisher
	 *            the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/**
	 * @return the publish_date
	 */
	public Date getPublish_date() {
		return publish_date;
	}

	/**
	 * @param publish_date
	 *            the publish_date to set
	 */
	public void setPublish_date(Date publish_date) {
		this.publish_date = publish_date;
	}

	/**
	 * @return the pages
	 */
	public int getPages() {
		return pages;
	}

	/**
	 * @param pages
	 *            the pages to set
	 */
	public void setPages(int pages) {
		this.pages = pages;
	}

	/**
	 * @return the image_url
	 */
	public String getImage_url() {
		return image_url;
	}

	/**
	 * @param image_url
	 *            the image_url to set
	 */
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BookInfo [publisher=").append(publisher)
				.append(", publish_date=").append(publish_date)
				.append(", pages=").append(pages).append("]");
		return builder.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//return super.clone();
		//完成深COPY
		BookInfo nbi = new BookInfo();
		//依次给所有属性赋值
		if(this.image_url != null){
			nbi.image_url = new String(this.image_url);
		}
		nbi.pages = this.pages;
		
		if(this.publish_date != null){
			nbi.publish_date = (Date) this.publish_date.clone();
		}
		if(this.publisher != null){
			nbi.publisher = new String(this.publisher);
		}
		//
		return nbi;
	}
	
	
}
