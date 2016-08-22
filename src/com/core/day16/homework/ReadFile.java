/**
 * 
 */
package com.core.day16.homework;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��ȡ�ļ����һ��
 * 
 * @author HQ
 *
 */
public class ReadFile {
	public static void main(String[] args) {
		String path = "src/com/core/day16/homework/poem.txt";
		lastFile(path);
	}

	public static void lastFile(String path) {
		// ����һ����������ļ�����,������Ϊ�ɶ�дģʽ
		try (RandomAccessFile raf = new RandomAccessFile(path, "r");) {
			// ��ȡ��ǰ�ļ�ָ��ƫ����
			long offset = 0;
			String line = null;
			offset = raf.length();// ��ȡָ�����һλ��ƫ����

			do {
				raf.seek(offset - 1); // ��ָ��������һλ
				offset = raf.getFilePointer();// ��ȡ��ǰ�ļ�ָ��λ��
			} while (raf.readByte() != '\n');// ��������ȡ���ֽڲ��ǻ��з�ʱ

			while ((line = raf.readLine()) != null) {// readLine()��ȡ����,���������з�
				line = new String(line.getBytes("ISO-8859-1"), "GBK");// �����ٽ���
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
