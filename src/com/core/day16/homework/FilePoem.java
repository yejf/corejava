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
 * ��һ�������һ�׹�ʫ���ļ��ж�ȡ���ݣ���ת��һ�ָ�ʽ��
����д����һ���ļ��С�
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
			
			//����һ���м����
			String line = null;
			
			//����һ��StringBuilder,����Ź�ʫ
			StringBuilder builder = new StringBuilder();
			
			//ѭ����ȡ
			while(true){
				line = br.readLine();
				if(line==null)
					break;
				builder.append(line);
			}
			//System.out.println(builder);
			//�ҳ��±��i��j֮��Ĺ�ϵ
			//i=0 		 	j=0   j=1   j=2    j=3
					//��һ��:  18    12     6     0
			//i=1
					//�ڶ���:  19    13     7     1
			//�ܽ�:(3-j)*6+i
			
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 4; j++) {
					System.out.print(builder.charAt((3-j)*6+i));
					if(j==3){
						System.out.println();
					}
					//д���ļ���
					pw.print(builder.charAt((3-j)*6+i));
				}
				//����
				pw.println();
			}
			System.out.println(":)д��ɹ�!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
