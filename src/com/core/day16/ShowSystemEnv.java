/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day16;

import java.io.File;
import java.util.Properties;

/**
 * @author yejf
 *
 */
public class ShowSystemEnv {

	public static void main(String[] args) {
		Properties props = System.getProperties();
		//输出
		props.list(System.out);
		//
		System.out.println("==========================");
		
		//列出当前电脑中临时文件夹下的所有文件和子目录
		String tmpPath = System.getProperty("java.io.tmpdir");
		//转成File
		File tmpFile = new File(tmpPath);
		//列出
//		String[] names = tmpFile.list();
		File[] names = tmpFile.listFiles();
		//
		int count = 0;
		long total = 0L;
		for(File name : names) {
			System.out.println(name.getName());
			count++;
			if(name.isDirectory()) {
				System.out.println(name.length());
				//如果是目录，应该使用递归来计算它里面的每一个文件的大小
				
			} else {
				total += name.length();
			}
		}
		System.out.println("\n共计："+count);
		System.out.printf
			("\n总计大小是：%d 字节，%.2f M\n",total,total/(1024.0*1024));
	}
}
