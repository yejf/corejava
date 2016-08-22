package com.core.day16;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/****
 * 字节流到字符流的桥接
 * @author yejf
 *
 */
public class StreamBridgeDemo {

	public static void main(String[] args) {
		int a = inputInt("请输入整数>");
		//
		System.out.println("你输入了："+a);
		
		System.out.println("====================================");
		String path = "data\\javase-day09.txt";
		readFile(path);
	}
	
	public static int inputInt(String msg) {
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(
						new InputStreamReader(System.in));
			//
			System.out.print(msg);
			//
			String line = br.readLine();
			//转换成整数
			int i = Integer.parseInt(line);
			return i;
			
		} catch (Exception e) {
			System.out.printf("\t输入不正确,%s\n",e.getMessage());
			//
			return inputInt(msg);
		} 
	}
	
	//利用readLine整行读取
	public static void readFile(String path) {
		/*try (BufferedReader br = 
				new BufferedReader(new FileReader(path))) {*/
		
		//如果涉及到字符集，则建议使用 桥接器 来指定字符集
		try (BufferedReader br = 
					new BufferedReader(
							new InputStreamReader( //桥接器
									new FileInputStream(path),"GBK"))) {
			//
			String line = null;
			while((line = br.readLine()) != null) {
				//
				System.out.println(line);
				//
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
