/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 利用static 关键字开发的日期工具类，提供了一些关于
 * 日期操作的便捷功能。
 * @author yejf
 *
 */
public class DateUtil {

	/******
	 * 根据传入的年分、月份、日 来构建一个Date对象
	 * @param y 代表年份
	 * @param m	代表月份
	 * @param d	代表日
	 * @return
	 */
	public static Date create(int y, int m, int d) {
		return create(y, m, d, 0, 0, 0);
	}
	
	public static Date create(int y, int m, int d, 
						int hour, int minute, int second) {
		Calendar c = Calendar.getInstance();
		//重新设定此日历的年、月、日
		c.set(Calendar.YEAR, y);
		c.set(Calendar.MONTH, m-1);
		c.set(Calendar.DAY_OF_MONTH, d);
		//把时分秒清0
		c.set(Calendar.HOUR_OF_DAY, hour);
		c.set(Calendar.MINUTE, minute);
		c.set(Calendar.SECOND, second);
		//返回日期
		return c.getTime();
	}
	
	/****
	 * 检测月份是否合法
	 * @param m
	 * @return
	 */
	public static boolean checkMonth(int m) {
		//
		return m < 1 || m > 12;
	}
	
	/****
	 * 检测年份是否合法
	 * @param y
	 * @return
	 */
	public static boolean checkYear(int y) {
		//
		return y < 0;
	}
	
	/****
	 * 使用指定的模式来格式化日期
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
	 * 使用 格式 yyyy-MM-dd 来格式化日期。
	 * @param d
	 * @return
	 */
	public static String format(Date d) {
		return format(d, PATTERN);
	}
	
	/****
	 * 根据指定的格式来解析日期字符串
	 * @param dateStr 日期字符串
	 * @param pattern 解析模式
	 * @return
	 */
	public static Date parse(String dateStr, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date d = null;
		//异常处理
		try {
			d = sdf.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		//返回
		return d;
	}
	
	/****
	 * 采用固定的模式去解析日期字符串
	 * @param dateStr
	 * @return
	 */
	public static Date parse(String dateStr) {
		return parse(dateStr, PATTERN);
	}
	
	/** 提供一个模式的常量 */
	public static final String PATTERN = "yyyy-MM-dd";
	
}



