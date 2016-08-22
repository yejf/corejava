package com.core.day15;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		String path = "d:\\temp";
		//����File����
		File f = new File(path);
		//
		if(f.exists()) {
			System.out.println("���ڴ�·����"+path);
		} else {
			System.out.println("�����ڡ�");
		}
		//
		if(f.isDirectory()) {
			System.out.println("��·����һ��Ŀ¼:"+path);
			//�ڴ�Ŀ¼�´���һ���ļ�
			File f1 = new File(f, "hello.txt");
			//
			try {
				if(f1.createNewFile()) {
					System.out.println("�����ɹ�...");
				}
				//�������ļ��Ĵ�С
				System.out.println("��С��"+f1.length());
				
				System.out.println("ɾ�����ļ�");
				//ɾ�� ���ļ�
//				f1.delete();
				f1.deleteOnExit();
				
				//ģ�� ����ִ��5����
				Thread.sleep(3000);
				
			} catch (IOException | InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("---------------------");
		//����һ������·�� 
		path = "\\\\192.168.0.41\\����\\5.����&��ҵ�ύ\\JSD1606";
		//
		File f3 = new File(path);
		//
		if(f3.exists() && f3.isDirectory()) {
			//��ȡ����������Ŀ¼
//			String[] names = f3.list();
			String[] names = f3.list(new FirstNameFilter("��"));
			//
			for(String name : names) {
				System.out.println(name);
			}
			System.out.println("���ƣ�"+names.length);
		}
	}
}


