/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
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
		//����2016��7��1��
		Date d = DateUtil.create(2015, 2, 19);
		cal.setTime(d);
		//��ȡ�ܼ�
		week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(days);
		
		//
		System.out.println(d);
		//��ʽ���� yyyy-MM-dd HH:mm:ss
		String pattern = "'My Birthday is' MM 'of' yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		//
		String dStr = sdf.format(d);
		System.out.println(dStr);
		
		//���ַ�����ԭΪ Date
		try {
			Date d2 = sdf.parse(dStr);
			System.out.println(d2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}
