package com.core.day15;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		String path = "d:\\temp";
		//创建File对象
		File f = new File(path);
		//
		if(f.exists()) {
			System.out.println("存在此路径："+path);
		} else {
			System.out.println("不存在。");
		}
		//
		if(f.isDirectory()) {
			System.out.println("此路径是一个目录:"+path);
			//在此目录下创建一个文件
			File f1 = new File(f, "hello.txt");
			//
			try {
				if(f1.createNewFile()) {
					System.out.println("创建成功...");
				}
				//输出这个文件的大小
				System.out.println("大小："+f1.length());
				
				System.out.println("删除此文件");
				//删除 此文件
//				f1.delete();
				f1.deleteOnExit();
				
				//模拟 程序还执行5秒钟
				Thread.sleep(3000);
				
			} catch (IOException | InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("---------------------");
		//构建一个网络路径 
		path = "\\\\192.168.0.41\\共享\\5.考试&作业提交\\JSD1606";
		//
		File f3 = new File(path);
		//
		if(f3.exists() && f3.isDirectory()) {
			//获取它的所有子目录
//			String[] names = f3.list();
			String[] names = f3.list(new FirstNameFilter("王"));
			//
			for(String name : names) {
				System.out.println(name);
			}
			System.out.println("共计："+names.length);
		}
	}
}


