/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
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
		//�����ϵ��ַ���������һ������
		Date d1 = DateUtil.parse(str);
		//
		System.out.println(d1);
		
		//
		String str2 = "03 of 12�� in 2016��";
		//��str2����������
		String p = "dd' of 'MM'�� in 'yyyy'��'";
		Date d2 = DateUtil.parse(str2, p);
		//
		System.out.println(d2);
		
		//
		System.out.printf("%s\n",DateUtil.format(d2));
		
		//������ת��������
		long t = d2.getTime(); //
		System.out.println(t);
		
		//ֻ��Ҫ���
		Calendar cal = Calendar.getInstance();
		cal.setTime(d2); //�����������ڸĳ�d2
		//������ȡ���
		int y = cal.get(Calendar.YEAR);
		System.out.println(y);
	}

}


