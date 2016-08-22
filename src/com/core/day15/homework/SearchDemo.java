/**
 * 
 */
package com.core.day15.homework;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

/**
 * @author 周生施
 *
 */
public class SearchDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请用户输入文件夹名");
		String path = sc.nextLine();
		System.out.println("请输入文件拓展名");
		final String search = sc.nextLine();
		sc.close();

		File f = new File(path);
		if (f.exists()) {
			System.out.println("存在此路径:" + path);
		} else {
			System.out.println("不存在.");
			return;
		}
		if (f.isDirectory()) {
			System.out.println("此路径是一个目录：" + path);

		}
		File f1 = new File(path);
		// 过滤器
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
		System.out.printf("共计%d", count);
	}

}
