/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.core.util.DateUtil;

/**
 * @author yejf
 *
 */
public class TestCalendar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
//		int i = cal.getFirstDayOfWeek();
		//构建2016年7月1号
		Date d = DateUtil.create(2015, 2, 19);
		cal.setTime(d);
		//获取周几
		week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(days);
		
		//
		System.out.println(d);
		//格式化成 yyyy-MM-dd HH:mm:ss
		String pattern = "'My Birthday is' MM 'of' yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		//
		String dStr = sdf.format(d);
		System.out.println(dStr);
		
		//从字符串还原为 Date
		try {
			Date d2 = sdf.parse(dStr);
			System.out.println(d2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}
