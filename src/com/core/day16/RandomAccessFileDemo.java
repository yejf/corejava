/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day16;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author yejf
 *
 */
public class RandomAccessFileDemo {

	public static void main(String[] args) {
		//
		String path = "data\\show.java";
		
		//
		try (RandomAccessFile raf = 
					new RandomAccessFile(path, "rw");) {
			//获取当前文件指针偏移量
			long offset = raf.getFilePointer();
			// 获取文件大小
			long length = raf.length();
			System.out.printf
			("文件大小:%d字节，当前文件指针位置：%d\n",length,offset);
			//循环读
			String line = null;
			int count = 0;
			while((line = raf.readLine()) != null) {
				//先编码后再解码
				line = new String(line.getBytes("ISO-8859-1"),"GBK");
				count++;
				//输出
				System.out.println(line);
				
				//再看文件偏移量
				offset = raf.getFilePointer();
				System.out.println("当前文件指针位置："+offset);
				//当读到第18行时，退出
				if(count == 18) {
					System.out.println("\n\n已读到第18行...");
					break;
				}
			}
			//重新设定文件指针的位置在倒数第30个字符处
			raf.seek(length - 30);
			//再读取一行
			line = raf.readLine();
			//
			System.out.println(line);
			//
			System.out.println("\n\n当前偏移量："+raf.getFilePointer());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
