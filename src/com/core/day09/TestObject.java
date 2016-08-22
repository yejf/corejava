/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day09;

import com.core.util.DateUtil;

/**
 * @author yejf
 *
 */
public class TestObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Book b1 = new Book("10512301", 
					new String[]{"莫言"}, 26.8, "蛙");
		//
		System.out.println(b1); //相当于调用了 b1.toString() 方法
		
		Book b2 = new Book("10512301", 
				new String[]{"莫言"}, 26.8, "蛙");
		//创建一个图书明细
		BookInfo bi = new BookInfo("新华出版社", 
				DateUtil.create(2012, 10, 12), 358);
		//把此明细添加给b2
		b2.setInfo(bi);
		
		System.out.printf("b1==b2? %b\n",b1 == b2);
		System.out.printf("b1.equals(b2)? %b\n",b1.equals(b2));
		//
		System.out.println(b2); // toString
		
		//克隆对象
		try {
			Book b3 = (Book) b2.clone();
			System.out.println(b3 == b2); //false
			
			//现在修改 b3的name,看看会不会影响b2的name
			b3.setAuthor(new String[]{"jack","rose"});
			//
			System.out.printf("b3: %s\n",b3);
			System.out.printf("b2: %s\n",b2);
			System.out.println("------ 分割线 ---------");
			
			//现在修改b3的bookinfo属性，再看会不会影响b2  
			b3.getInfo().setPublisher("人文出版社");
			b3.getInfo().setPages(100);
			
			System.out.printf("b3: %s\n",b3);
			System.out.printf("b2: %s\n",b2);
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		Book b4 = b2; //这个不是克隆，这个是地址赋值。
		System.out.println(b4 == b2);
	}

}


