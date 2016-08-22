/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ����static �ؼ��ֿ��������ڹ����࣬�ṩ��һЩ����
 * ���ڲ����ı�ݹ��ܡ�
 * @author yejf
 *
 */
public class DateUtil {

	/******
	 * ���ݴ������֡��·ݡ��� ������һ��Date����
	 * @param y �������
	 * @param m	�����·�
	 * @param d	������
	 * @return
	 */
	public static Date create(int y, int m, int d) {
		return create(y, m, d, 0, 0, 0);
	}
	
	public static Date create(int y, int m, int d, 
						int hour, int minute, int second) {
		Calendar c = Calendar.getInstance();
		//�����趨���������ꡢ�¡���
		c.set(Calendar.YEAR, y);
		c.set(Calendar.MONTH, m-1);
		c.set(Calendar.DAY_OF_MONTH, d);
		//��ʱ������0
		c.set(Calendar.HOUR_OF_DAY, hour);
		c.set(Calendar.MINUTE, minute);
		c.set(Calendar.SECOND, second);
		//��������
		return c.getTime();
	}
	
	/****
	 * ����·��Ƿ�Ϸ�
	 * @param m
	 * @return
	 */
	public static boolean checkMonth(int m) {
		//
		return m < 1 || m > 12;
	}
	
	/****
	 * �������Ƿ�Ϸ�
	 * @param y
	 * @return
	 */
	public static boolean checkYear(int y) {
		//
		return y < 0;
	}
	
	/****
	 * ʹ��ָ����ģʽ����ʽ������
	 * @param d
	 * @param pattern
	 * @return
	 */
	public static String format(Date d, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		//
		return sdf.format(d);
	}
	
	/****
	 * ʹ�� ��ʽ yyyy-MM-dd ����ʽ�����ڡ�
	 * @param d
	 * @return
	 */
	public static String format(Date d) {
		return format(d, PATTERN);
	}
	
	/****
	 * ����ָ���ĸ�ʽ�����������ַ���
	 * @param dateStr �����ַ���
	 * @param pattern ����ģʽ
	 * @return
	 */
	public static Date parse(String dateStr, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date d = null;
		//�쳣����
		try {
			d = sdf.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		//����
		return d;
	}
	
	/****
	 * ���ù̶���ģʽȥ���������ַ���
	 * @param dateStr
	 * @return
	 */
	public static Date parse(String dateStr) {
		return parse(dateStr, PATTERN);
	}
	
	/** �ṩһ��ģʽ�ĳ��� */
	public static final String PATTERN = "yyyy-MM-dd";
	
}



