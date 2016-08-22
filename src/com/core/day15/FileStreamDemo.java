/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
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
		//׼��һ���ı��ļ���·��
		String path = "d:\\temp\\C���Ե����½�-�ڶ���[150710].wmv";
		String target = "d:\\temp\\copy2.wmv";
		//
		File file = new File(path);
		//�жϴ��ļ��Ƿ����
		if(!file.exists()) {
			System.out.println("�ļ�������: "+file);
			return ;
		}
		// ���ھͼ���
//		FileInputStream fis = null;
//		FileOutputStream fos = null;
		//�����ֽ�����
		byte[] buf = new byte[1024*1024]; //�����С���趨����ʵ���鲿��
		int len = -1; //���ʵ�ʶ������ֽ���
		long total = 0L;
		/*try {
			//��ʼ��������
			fis = new FileInputStream(file);
			//�ٳ�ʼ�������
			fos = new FileOutputStream(target);//Ŀ���ļ�������ʱ�����Զ�����
			//ѭ����д
			while((len = fis.read(buf)) != -1) {
				total += len;
				//��д�������֮ǰ�����Զ��ֽ������� ����.
				//...
				//д���� �����
				fos.write(buf, 0, len); //д��ʵ�ʶ������ֽ���
				//
				System.out.printf
					("�Ѷ�ȡ[%d]�ֽڣ���д�룬��ʣ��[%d]�ֽڡ�\n",
												total,fis.available());
			}
			//
			System.out.printf("��д��ɣ����ƣ�[%d]�ֽ�����\n",total);
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			//�ͷ���Դ
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
		
		//JDK1.7 �汾�е�д��
		try(FileInputStream fis = new FileInputStream(file);
				FileOutputStream fos = new FileOutputStream(target)) {
			//
			//ѭ����д
			while((len = fis.read(buf)) != -1) {
				total += len;
				//��д�������֮ǰ�����Զ��ֽ������� ����.
				//...
				//д���� �����
				fos.write(buf, 0, len); //д��ʵ�ʶ������ֽ���
				//
				System.out.printf
					("�Ѷ�ȡ[%d]�ֽڣ���д�룬��ʣ��[%d]�ֽڡ�\n",
												total,fis.available());
			}
			//
			System.out.printf("��д��ɣ����ƣ�[%d]�ֽ�����\n",total);
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
