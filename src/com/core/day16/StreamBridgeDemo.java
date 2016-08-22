package com.core.day16;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/****
 * �ֽ������ַ������Ž�
 * @author yejf
 *
 */
public class StreamBridgeDemo {

	public static void main(String[] args) {
		int a = inputInt("����������>");
		//
		System.out.println("�������ˣ�"+a);
		
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
			//ת��������
			int i = Integer.parseInt(line);
			return i;
			
		} catch (Exception e) {
			System.out.printf("\t���벻��ȷ,%s\n",e.getMessage());
			//
			return inputInt(msg);
		} 
	}
	
	//����readLine���ж�ȡ
	public static void readFile(String path) {
		/*try (BufferedReader br = 
				new BufferedReader(new FileReader(path))) {*/
		
		//����漰���ַ���������ʹ�� �Ž��� ��ָ���ַ���
		try (BufferedReader br = 
					new BufferedReader(
							new InputStreamReader( //�Ž���
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
