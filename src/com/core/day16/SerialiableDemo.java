/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
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
		// ��д����
		Book b1 = new Book("1001", new String[]{"Ī��"}, 25.6, "��");
		Book b2 = new Book("1002", new String[]{"��ӹ"}, 15.6, "Ц������");
		Book b3 = new Book("1003", new String[]{"����","Y����"}, 45.6, "��Խ");
		Book b4 = new Book("1004", new String[]{"����","������"}, 19.6, "Сʱ��");
		
		List<Book> books = new ArrayList<>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		
		//Ҫ��������ϳ־û����ļ���
		writeList(books);
		
		//
		b1.setName("����ƣ��");
		System.out.println(b1);
		books.clear();
		//
		System.out.println(books.size());
		
		//������
		books = readList();
		System.out.println("��������"+books.size());
		//
		for(Book b : books) {
			System.out.println(b);
		}
	}

	public static void writeList(List<Book> books) {
		// ����file
		File file = new File(path);
		if (file.isDirectory()) {
			throw new RuntimeException("���ǺϷ��������ļ���" + file);
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
		// ����file
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
			System.out.println("û���ҵ������ļ�:"+file);
		}
		
		return null;
	}
}
