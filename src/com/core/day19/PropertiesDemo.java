/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
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
			System.out.println("加载属性文件成功");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("加载属性文件失败...");
		}
	}
	
	public static String getValue(String key) {
		return props == null ? null : props.getProperty(key);
	}
			
}
