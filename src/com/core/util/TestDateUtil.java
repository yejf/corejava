/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.util;

import java.util.Calendar;
import java.util.Date;

/**
 * @author yejf
 *
 */
public class TestDateUtil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "2012-12-08";
		//把以上的字符串解析成一个日期
		Date d1 = DateUtil.parse(str);
		//
		System.out.println(d1);
		
		//
		String str2 = "03 of 12月 in 2016年";
		//把str2解析成日期
		String p = "dd' of 'MM'月 in 'yyyy'年'";
		Date d2 = DateUtil.parse(str2, p);
		//
		System.out.println(d2);
		
		//
		System.out.printf("%s\n",DateUtil.format(d2));
		
		//把日期转换成整数
		long t = d2.getTime(); //
		System.out.println(t);
		
		//只想要年份
		Calendar cal = Calendar.getInstance();
		cal.setTime(d2); //把日历的日期改成d2
		//再来获取年份
		int y = cal.get(Calendar.YEAR);
		System.out.println(y);
	}

}


