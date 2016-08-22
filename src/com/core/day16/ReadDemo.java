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
 * @author ����
 *
 */
public class ReadDemo {
	
	public static void main(String[] args) {
		String path = "src/com/core/day16/SerialiableDemo.java";
		showFileContent(path, 60);
	}

	/**
	 * ��ʾָ�����ı��ļ�����
	 * @param path �ı��ļ�·��
	 * @param milliSecond ������
	 */
	public static void showFileContent(String path,long milliSecond) {
		// 
		File file = new File(path);
		if(!file.exists()) {
			System.out.printf("�ļ������ڣ�%s\n",file);
			return;
		}
		if(!file.isFile() || !file.canRead()) {
			System.out.printf("�ļ����ϸ��û��Ȩ�޶�ȡ:%s\n",file);
			return;
		}
		
		//
		int c = -1; //ʵ�ʶ������ַ�
		try (FileReader fr = new FileReader(file);
				PrintWriter pw = 
						new PrintWriter(
								new FileWriter("data\\show.java"),true)) {
			//һ��һ���ַ���
			while((c = fr.read()) != -1) {
				//�����Ҳ��������һ����������
				//
				System.out.print((char)c);
				//д���ļ���
				pw.printf("%s",(char)c);
//				pw.flush();
				
				//�±�ģ��sleepʱ��
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
