/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day16;

import java.io.File;
import java.util.Properties;

/**
 * @author yejf
 *
 */
public class ShowSystemEnv {

	public static void main(String[] args) {
		Properties props = System.getProperties();
		//���
		props.list(System.out);
		//
		System.out.println("==========================");
		
		//�г���ǰ��������ʱ�ļ����µ������ļ�����Ŀ¼
		String tmpPath = System.getProperty("java.io.tmpdir");
		//ת��File
		File tmpFile = new File(tmpPath);
		//�г�
//		String[] names = tmpFile.list();
		File[] names = tmpFile.listFiles();
		//
		int count = 0;
		long total = 0L;
		for(File name : names) {
			System.out.println(name.getName());
			count++;
			if(name.isDirectory()) {
				System.out.println(name.length());
				//�����Ŀ¼��Ӧ��ʹ�õݹ��������������ÿһ���ļ��Ĵ�С
				
			} else {
				total += name.length();
			}
		}
		System.out.println("\n���ƣ�"+count);
		System.out.printf
			("\n�ܼƴ�С�ǣ�%d �ֽڣ�%.2f M\n",total,total/(1024.0*1024));
	}
}
