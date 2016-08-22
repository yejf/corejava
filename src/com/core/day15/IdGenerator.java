/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
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

	//����
	private static final String path = "data\\id.dat";
	
	//
	/******
	 * ����Ψһ��id��
	 * @return
	 */
	public static long generate() {
		//�������
		long id = 1L;
		//1. Ҫ�ж�����ļ��Ƿ����
		File file = new File(path);
		//�������������
		if(!file.exists()) {
			//˵���ļ������ڣ�ֱ�ӷ���1������2д�뵽�ļ���
			//�����ļ�
			write(id+1,file);
			//�ٷ���
			return id;
		} else {
			//�ļ����ڣ� ��ȡ�ļ��е�ֵn������++n д�ص��ļ�
			id = read(file);
			//��д��
			write(id+1,file);
			//���� 
			return id;
		}
		
	}
	
	/****
	 * ���ļ��ж�ȡ������
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
			//��ȡ������
			return dis.readLong();
		} catch (IOException e) {
			throw new RuntimeException("��ȡʧ��", e);
		}
		
	}

	/****
	 * �ѳ�����valueд�뵽�ļ���
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
			throw new RuntimeException("д��ʧ��", e);
		}
	}
}
