/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day10;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;

/**
 * @author yejf
 *
 */
public class NumberFormatDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//格式化数字
		double d = 3.1415926;
		double rate = 0.035; //利率
		//格式化以上的浮点数
		NumberFormat nf = NumberFormat.getNumberInstance();
		//设定小数位
		nf.setMinimumFractionDigits(4);
		//指定舍入模式
		nf.setRoundingMode(RoundingMode.FLOOR);
		//格式化
		String dStr = nf.format(d);
		System.out.printf("%s\n",dStr);
		
		//格式化百分数的实例
		NumberFormat pf = NumberFormat.getPercentInstance();
		pf.setMinimumFractionDigits(2);
		String rateStr = pf.format(rate);
		System.out.printf("%s\n",rateStr);
		
		//把字符串解析成数字
		String s = "123%";
		try {
			//解析
			Number n = pf.parse(s);
			//得到基本类型
			double dn = n.doubleValue();
			//输出
			System.out.println(dn);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}



