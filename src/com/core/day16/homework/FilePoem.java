/**
 * 
 */
package com.core.day16.homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 从一个存放了一首古诗的文件中读取数据，并转换一种格式后
重新写入另一个文件中。
 * @author HQ
 *
 */
public class FilePoem {
	public static void main(String[] args) {
		method("src/com/core/day16/homework/poem.txt", 
				"src/com/core/day16/homework/poem_copy.txt");
	}
	
	
	private static void method(String path,String aim){

		try(BufferedReader br = new BufferedReader(new FileReader(path));
			PrintWriter pw = new PrintWriter(new FileWriter(aim))){
			
			//定义一个中间变量
			String line = null;
			
			//定义一个StringBuilder,来存放古诗
			StringBuilder builder = new StringBuilder();
			
			//循环读取
			while(true){
				line = br.readLine();
				if(line==null)
					break;
				builder.append(line);
			}
			//System.out.println(builder);
			//找出下标的i和j之间的关系
			//i=0 		 	j=0   j=1   j=2    j=3
					//第一行:  18    12     6     0
			//i=1
					//第二行:  19    13     7     1
			//总结:(3-j)*6+i
			
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 4; j++) {
					System.out.print(builder.charAt((3-j)*6+i));
					if(j==3){
						System.out.println();
					}
					//写入文件中
					pw.print(builder.charAt((3-j)*6+i));
				}
				//换行
				pw.println();
			}
			System.out.println(":)写入成功!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
