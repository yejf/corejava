/**
 * 
 */
package com.core.day15.homework;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

/**
 * @author ����ʩ
 *
 */
public class SearchDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���û������ļ�����");
		String path = sc.nextLine();
		System.out.println("�������ļ���չ��");
		final String search = sc.nextLine();
		sc.close();

		File f = new File(path);
		if (f.exists()) {
			System.out.println("���ڴ�·��:" + path);
		} else {
			System.out.println("������.");
			return;
		}
		if (f.isDirectory()) {
			System.out.println("��·����һ��Ŀ¼��" + path);

		}
		File f1 = new File(path);
		// ������
		String[] names = f1.list(new FilenameFilter() {

			@Override
			public boolean accept(File f1, String name) {
				File f2 = new File(f1, name);
				if (name.endsWith(search) && f2.isFile()) {
					return true;
				}
				return false;
			}
		});

		int count = 0;
		for (String name : names) {
			// File f2=new File(path+'\\'+name);
			// if(!f2.isDirectory()){
			System.out.println(name);
			count++;
			// }
		}
		System.out.printf("����%d", count);
	}

}
