/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
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
			//��ȡ��ǰ�ļ�ָ��ƫ����
			long offset = raf.getFilePointer();
			// ��ȡ�ļ���С
			long length = raf.length();
			System.out.printf
			("�ļ���С:%d�ֽڣ���ǰ�ļ�ָ��λ�ã�%d\n",length,offset);
			//ѭ����
			String line = null;
			int count = 0;
			while((line = raf.readLine()) != null) {
				//�ȱ�����ٽ���
				line = new String(line.getBytes("ISO-8859-1"),"GBK");
				count++;
				//���
				System.out.println(line);
				
				//�ٿ��ļ�ƫ����
				offset = raf.getFilePointer();
				System.out.println("��ǰ�ļ�ָ��λ�ã�"+offset);
				//��������18��ʱ���˳�
				if(count == 18) {
					System.out.println("\n\n�Ѷ�����18��...");
					break;
				}
			}
			//�����趨�ļ�ָ���λ���ڵ�����30���ַ���
			raf.seek(length - 30);
			//�ٶ�ȡһ��
			line = raf.readLine();
			//
			System.out.println(line);
			//
			System.out.println("\n\n��ǰƫ������"+raf.getFilePointer());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
