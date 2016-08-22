/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day19;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author yejf
 *
 */
public class PropertiesDemo {

	private static Properties props = new Properties();
	//
	private static String path = "demo.properties"; //
	
	//
	static {
		InputStream in = PropertiesDemo
							.class.getResourceAsStream(path);
		//
		try {
			props.load(in);
			System.out.println("���������ļ��ɹ�");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("���������ļ�ʧ��...");
		}
	}
	
	public static String getValue(String key) {
		return props == null ? null : props.getProperty(key);
	}
			
}
