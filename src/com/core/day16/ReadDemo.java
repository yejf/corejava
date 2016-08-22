/**
 * 
 */
package com.core.day16;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 周鹏
 *
 */
public class ReadDemo {
	
	public static void main(String[] args) {
		String path = "src/com/core/day16/SerialiableDemo.java";
		showFileContent(path, 60);
	}

	/**
	 * 显示指定的文本文件内容
	 * @param path 文本文件路径
	 * @param milliSecond 毫秒数
	 */
	public static void showFileContent(String path,long milliSecond) {
		// 
		File file = new File(path);
		if(!file.exists()) {
			System.out.printf("文件不存在：%s\n",file);
			return;
		}
		if(!file.isFile() || !file.canRead()) {
			System.out.printf("文件不合格或没有权限读取:%s\n",file);
			return;
		}
		
		//
		int c = -1; //实际读到的字符
		try (FileReader fr = new FileReader(file);
				PrintWriter pw = 
						new PrintWriter(
								new FileWriter("data\\show.java"),true)) {
			//一个一个字符读
			while((c = fr.read()) != -1) {
				//输出，也可以做进一步处理。。。
				//
				System.out.print((char)c);
				//写到文件里
				pw.printf("%s",(char)c);
//				pw.flush();
				
				//下标模拟sleep时间
				try {
					Thread.sleep((int)(Math.random()*milliSecond)+1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
