/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author yejf
 *
 */
public class FileStreamDemo {

	public static void main(String[] args) {
		//准备一个文本文件的路径
		String path = "d:\\temp\\C语言第四章节-第二段[150710].wmv";
		String target = "d:\\temp\\copy2.wmv";
		//
		File file = new File(path);
		//判断此文件是否存在
		if(!file.exists()) {
			System.out.println("文件不存在: "+file);
			return ;
		}
		// 存在就继续
//		FileInputStream fis = null;
//		FileOutputStream fos = null;
		//定义字节数组
		byte[] buf = new byte[1024*1024]; //缓存大小的设定根据实际情部来
		int len = -1; //存放实际读到的字节数
		long total = 0L;
		/*try {
			//初始化输入流
			fis = new FileInputStream(file);
			//再初始化输出流
			fos = new FileOutputStream(target);//目标文件不存在时，会自动创建
			//循环读写
			while((len = fis.read(buf)) != -1) {
				total += len;
				//在写到输出流之前，可以对字节数组做 处理.
				//...
				//写出到 输出流
				fos.write(buf, 0, len); //写入实际读到的字节数
				//
				System.out.printf
					("已读取[%d]字节，并写入，还剩下[%d]字节。\n",
												total,fis.available());
			}
			//
			System.out.printf("读写完成，共计：[%d]字节数。\n",total);
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			//释放资源
			try {
				if(fis != null)
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}*/
		
		//JDK1.7 版本中的写法
		try(FileInputStream fis = new FileInputStream(file);
				FileOutputStream fos = new FileOutputStream(target)) {
			//
			//循环读写
			while((len = fis.read(buf)) != -1) {
				total += len;
				//在写到输出流之前，可以对字节数组做 处理.
				//...
				//写出到 输出流
				fos.write(buf, 0, len); //写入实际读到的字节数
				//
				System.out.printf
					("已读取[%d]字节，并写入，还剩下[%d]字节。\n",
												total,fis.available());
			}
			//
			System.out.printf("读写完成，共计：[%d]字节数。\n",total);
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
