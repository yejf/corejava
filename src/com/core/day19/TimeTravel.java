/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day19;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

import com.core.util.DateUtil;

/**
 * @author yejf
 *
 */
public class TimeTravel {

	public static void main(String[] args) {
		//ͨ������API����ȡע������ݲ�����travelThroughTime����
		try {
			Method m = TimeTravel.class.getMethod
							("travelThroughTime", 
									String.class, Date.class, 
										new String[]{}.getClass());
			//ͨ��method����ȡ����ע��
			Description d = m.getAnnotation(Description.class);
			//ͨ��ע���õ�����ֵ
			Name name = d.name();
			String first = name.first();
			String last = name.last();
			String fname = first + last;
			String[] hobby = d.hobby();
			//���ַ�����dateת��������
			Date date = DateUtil.parse(d.date());
			//
			m.invoke(null, fname, date, hobby);
			
		} catch (NoSuchMethodException | SecurityException 
					| IllegalAccessException | IllegalArgumentException 
						| InvocationTargetException e) {
			e.printStackTrace();
		}
				
	}
	
	/******
	 * ��ʾ
	 * @param name ʱ������������
	 * @param time ʱ������Ŀ��ʱ��
	 * @param hobby ʱ�������ߵİ���
	 */
	@Description(
			id = 1010,
			name = @Name(first="��",last="�޼�"),
			date = "2050-07-15",
			hobby = {"����","����","����"}
	)
	public static void travelThroughTime
				(String name,Date time,String[] hobby) {
		
		System.out.printf("[%s]��Խʱ�յ��� %s ��һ��.\n"
								,name,DateUtil.format(time));
		if(hobby != null) {
			System.out.println("�������°��ã�");
			for(String h : hobby) {
				System.out.printf("%s\t",h);
			}
		}
	}
}



