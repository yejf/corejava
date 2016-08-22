/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
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
		//通过反射API来获取注解的数据并调用travelThroughTime方法
		try {
			Method m = TimeTravel.class.getMethod
							("travelThroughTime", 
									String.class, Date.class, 
										new String[]{}.getClass());
			//通过method来获取它的注解
			Description d = m.getAnnotation(Description.class);
			//通过注解拿到属性值
			Name name = d.name();
			String first = name.first();
			String last = name.last();
			String fname = first + last;
			String[] hobby = d.hobby();
			//把字符串的date转换成日期
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
	 * 演示
	 * @param name 时间旅行者姓名
	 * @param time 时间旅行目标时间
	 * @param hobby 时间旅行者的爱好
	 */
	@Description(
			id = 1010,
			name = @Name(first="张",last="无忌"),
			date = "2050-07-15",
			hobby = {"武术","阴阳","旅行"}
	)
	public static void travelThroughTime
				(String name,Date time,String[] hobby) {
		
		System.out.printf("[%s]穿越时空到了 %s 这一天.\n"
								,name,DateUtil.format(time));
		if(hobby != null) {
			System.out.println("他有如下爱好：");
			for(String h : hobby) {
				System.out.printf("%s\t",h);
			}
		}
	}
}



