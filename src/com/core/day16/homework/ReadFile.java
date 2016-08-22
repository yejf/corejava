/**
 * 
 */
package com.core.day16.homework;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读取文件最后一行
 * 
 * @author HQ
 *
 */
public class ReadFile {
	public static void main(String[] args) {
		String path = "src/com/core/day16/homework/poem.txt";
		lastFile(path);
	}

	public static void lastFile(String path) {
		// 创建一个随机访问文件对象,并设置为可读写模式
		try (RandomAccessFile raf = new RandomAccessFile(path, "r");) {
			// 获取当前文件指针偏移量
			long offset = 0;
			String line = null;
			offset = raf.length();// 获取指针最后一位的偏移量

			do {
				raf.seek(offset - 1); // 将指针往后移一位
				offset = raf.getFilePointer();// 获取当前文件指针位置
			} while (raf.readByte() != '\n');// 当单个读取的字节不是换行符时

			while ((line = raf.readLine()) != null) {// readLine()读取整行,不包括换行符
				line = new String(line.getBytes("ISO-8859-1"), "GBK");// 加密再解密
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
