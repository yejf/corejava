package com.core.day15.homework;

import java.io.File;

public class homework1 {

	public static void main(String[] args) {
		String path = System.getProperty("java.io.tmpdir");
		File f = new File(path);
		search(f, ".tmp");
	}

	public static void search(File f, String s) {
		if (f.exists()) {
			System.out.println("存在此路径" + f.getPath());
		} else {
			System.out.println("不存在");
		}

		String[] names = f.list(new FirstNameFilter2(s));
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println();

	}

}
