/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day16;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.core.day09.Book;

/**
 * @author yejf
 *
 */
public class SerialiableDemo {

	private static String path = "data\\books.dat";

	public static void main(String[] args) {
		// 读写对象
		Book b1 = new Book("1001", new String[]{"莫言"}, 25.6, "蛙");
		Book b2 = new Book("1002", new String[]{"金庸"}, 15.6, "笑傲江湖");
		Book b3 = new Book("1003", new String[]{"黄易","Y先生"}, 45.6, "穿越");
		Book b4 = new Book("1004", new String[]{"韩寒","郭敬明"}, 19.6, "小时代");
		
		List<Book> books = new ArrayList<>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		
		//要把这个集合持久化到文件中
		writeList(books);
		
		//
		b1.setName("生死疲劳");
		System.out.println(b1);
		books.clear();
		//
		System.out.println(books.size());
		
		//读出来
		books = readList();
		System.out.println("读出来后："+books.size());
		//
		for(Book b : books) {
			System.out.println(b);
		}
	}

	public static void writeList(List<Book> books) {
		// 构建file
		File file = new File(path);
		if (file.isDirectory()) {
			throw new RuntimeException("不是合法的数据文件：" + file);
		}
		//
		try (ObjectOutputStream oos = 
					new ObjectOutputStream(
						new BufferedOutputStream(
								new FileOutputStream(file)))) {
			//
			oos.writeObject(books);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public static List<Book> readList() {
		// 构建file
		File file = new File(path);
		if (file.exists() && file.isFile()) {
			
			try (ObjectInputStream ois = 
					new ObjectInputStream(
							new BufferedInputStream(
									new FileInputStream(file)))) {
				return (List<Book>) ois.readObject();
				
			}catch(IOException | ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		} else {
			System.out.println("没有找到数据文件:"+file);
		}
		
		return null;
	}
}
