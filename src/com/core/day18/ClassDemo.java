/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day18;

import java.lang.reflect.Field;

import com.core.day09.Book;

/**
 * 反射 的入口
 * @author yejf
 *
 */
public class ClassDemo {

	
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//使用三种方式来获取 Class实例
		//A. 
		Class<Book> c1 = Book.class;
		
		//B.
		Book b = new Book();
		Class<Book> c2 = (Class<Book>) b.getClass();
		
		//C.
		String name = "com.core.day09.Book";
		try {
			Class<Book> c3 = (Class<Book>) Class.forName(name);
			
			//以上三种方式得到的Class是一样的。
			System.out.println(c1 == c2);
			System.out.println(c2 == c3);
			System.out.println(c1 == c3);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//测试
		String cname = "com.core.day17.IntegerRun";
		Object o = createObjectOfReflect(cname);
		System.out.println(o);
		
		System.out.println("////////////////////////////////");
		Book b2 = createBookAndSetValue
				("蛙", new String[]{"莫言","好言"}, "100235", 16.9);
		System.out.println(b2);
	}
	
	//通过反射来创建某个类的对象
	public static Object createObjectOfReflect(String cname) {
		//1.通过类名得到 class 实例
		try {
			Class<?> c = Class.forName(cname);
			//通过 newInstance来创建对象
			return c.newInstance(); //会调用目标类的空参构造..
			
		} catch (ClassNotFoundException 
					| InstantiationException 
						| IllegalAccessException e) {
			e.printStackTrace();
		}
		//
		return null;
	}
	
	//
	@SuppressWarnings("unchecked")
	public static Book createBookAndSetValue
				(String name,String[] author,String isbn,double price) {
		//普通方法
		/*Book b = new Book();
		b.setAuthor(author);
		b.setName(name);
		b.setIsbn(isbn);
		b.setPrice(price);
		return b;*/
		//通过反射 来实现
		try {
			Class<Book> c = (Class<Book>) Class
								.forName("com.core.day09.Book");
			//通过 newInstance来创建对象
			Book b = c.newInstance(); //会调用目标类的空参构造..
			//通过反射 来给属性赋值。
			//获取属性
			Field nFiled = c.getDeclaredField("name");
			nFiled.setAccessible(true); //私有的属性要设定这个值为true
			nFiled.set(b, name); //
			Field aField = c.getDeclaredField("author");
			aField.setAccessible(true);
			aField.set(b, author);
			Field iField = c.getDeclaredField("isbn");
			iField.setAccessible(true);
			iField.set(b, isbn);
			Field pField = c.getDeclaredField("price");
			pField.setAccessible(true);
			pField.setDouble(b, price);
			//
			return b;
		} catch (ClassNotFoundException 
					| InstantiationException 
						| IllegalAccessException 
							| NoSuchFieldException 
								| SecurityException e) {
			e.printStackTrace();
		}
		//
		return null;
	}
}
