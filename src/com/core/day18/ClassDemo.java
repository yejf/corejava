/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day18;

import java.lang.reflect.Field;

import com.core.day09.Book;

/**
 * ���� �����
 * @author yejf
 *
 */
public class ClassDemo {

	
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//ʹ�����ַ�ʽ����ȡ Classʵ��
		//A. 
		Class<Book> c1 = Book.class;
		
		//B.
		Book b = new Book();
		Class<Book> c2 = (Class<Book>) b.getClass();
		
		//C.
		String name = "com.core.day09.Book";
		try {
			Class<Book> c3 = (Class<Book>) Class.forName(name);
			
			//�������ַ�ʽ�õ���Class��һ���ġ�
			System.out.println(c1 == c2);
			System.out.println(c2 == c3);
			System.out.println(c1 == c3);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//����
		String cname = "com.core.day17.IntegerRun";
		Object o = createObjectOfReflect(cname);
		System.out.println(o);
		
		System.out.println("////////////////////////////////");
		Book b2 = createBookAndSetValue
				("��", new String[]{"Ī��","����"}, "100235", 16.9);
		System.out.println(b2);
	}
	
	//ͨ������������ĳ����Ķ���
	public static Object createObjectOfReflect(String cname) {
		//1.ͨ�������õ� class ʵ��
		try {
			Class<?> c = Class.forName(cname);
			//ͨ�� newInstance����������
			return c.newInstance(); //�����Ŀ����Ŀղι���..
			
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
		//��ͨ����
		/*Book b = new Book();
		b.setAuthor(author);
		b.setName(name);
		b.setIsbn(isbn);
		b.setPrice(price);
		return b;*/
		//ͨ������ ��ʵ��
		try {
			Class<Book> c = (Class<Book>) Class
								.forName("com.core.day09.Book");
			//ͨ�� newInstance����������
			Book b = c.newInstance(); //�����Ŀ����Ŀղι���..
			//ͨ������ �������Ը�ֵ��
			//��ȡ����
			Field nFiled = c.getDeclaredField("name");
			nFiled.setAccessible(true); //˽�е�����Ҫ�趨���ֵΪtrue
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
