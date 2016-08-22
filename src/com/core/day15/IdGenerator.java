/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author yejf
 *
 */
public class IdGenerator {

	//属性
	private static final String path = "data\\id.dat";
	
	//
	/******
	 * 产生唯一性id的
	 * @return
	 */
	public static long generate() {
		//定义变量
		long id = 1L;
		//1. 要判断这个文件是否存在
		File file = new File(path);
		//创建输入输出流
		if(!file.exists()) {
			//说明文件不存在，直接返回1，并把2写入到文件中
			//创建文件
			write(id+1,file);
			//再返回
			return id;
		} else {
			//文件存在， 读取文件中的值n，并把++n 写回到文件
			id = read(file);
			//再写入
			write(id+1,file);
			//返回 
			return id;
		}
		
	}
	
	/****
	 * 从文件中读取长整数
	 * @param file
	 * @return
	 * @throws RuntimeException
	 */
	private static long read(File file) throws RuntimeException {
		//
		try (DataInputStream dis = 
					new DataInputStream(
						new BufferedInputStream(
							new FileInputStream(file)))) {
			//读取并返回
			return dis.readLong();
		} catch (IOException e) {
			throw new RuntimeException("读取失败", e);
		}
		
	}

	/****
	 * 把长整型value写入到文件中
	 * @param value
	 * @param file
	 * @throws IOException 
	 */
	private static void write(long value,File file) 
									throws RuntimeException {
		
		try (DataOutputStream dos = 
				new DataOutputStream(
						new BufferedOutputStream(
								new FileOutputStream(file)))) {
			dos.writeLong(value);
			
		} catch (IOException e) {
			throw new RuntimeException("写入失败", e);
		}
	}
}
