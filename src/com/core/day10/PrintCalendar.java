/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day10;

import java.util.Calendar;
import java.util.Scanner;

import com.core.util.DateUtil;

/**
 * @author yejf
 *
 */
public class PrintCalendar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入年份>");
		int y = sc.nextInt();
		System.out.print("请输入月份>");
		int m = sc.nextInt();
		if(m == 0) { //如果月份输入0，表示打印全年的日历
			PrintCalendar.print(y);
		}else{
			//调用方法
			PrintCalendar.print(y, m); //此处类名可以省略，因为在同一个类中
		}
		//
		sc.close();
	}
	
	/****
	 * 输出整年的日历
	 * @param y
	 */
	public static void print(int y) {
		//1至12的循环打印
		for(int i=1;i<=12;i++) {
			print(y,i);
		}
	}
	
	/****
	 * 输出指定年份和月份的日历
	 * @param y 年
	 * @param m 月
	 */
	public static void print(int y, int m) {
		//
		if(DateUtil.checkYear(y)) {
			System.out.printf("年份不合法： %d\n",y);
			return ;
		}
		//检查月份是否合法
		if(DateUtil.checkMonth(m)) {
			System.out.printf("月份不合法：%d\n",m);
			return ;
		}
		//定义变量
		Calendar cal = Calendar.getInstance();
		//得到今天是几号, 为了在它的前面输出一个 *
		int day = cal.get(Calendar.DAY_OF_MONTH);
		//把此日历对象年、月置为指定的年和月
		cal.set(Calendar.YEAR, y);
		cal.set(Calendar.MONTH, m-1);
		//把日定到当前的1号
		cal.set(Calendar.DAY_OF_MONTH, 1);
		
		//再获取此日历所包含的日期是周几
		//这个值从1至7，分别代表周日至周六
		int week = cal.get(Calendar.DAY_OF_WEEK);
		//再获取此日历所包含的日期 所在月份的最大天数[28,29,30,31]
		int max = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		//定义一个计数器，来决定换行
		int count = 0;
		
		//先输出年和月
		System.out.printf("\t\t%d年%d月\n\n",y,m);
		
		//打印，先输出头部
		System.out.printf
		("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
				"日","一","二","三","四","五","六");
		
		//先输出\t，个数是 week-1 次。
		for(int i=1;i<week;i++){
			System.out.print("\t");
			count++;
		}
		//从1开始循环，直到 max 结束
		for(int i=1;i <= max; i++){
			//输出 i, 当 i == day时，输出 *i
			System.out.printf("%s",(i == day) ? "*"+i : ""+i);
			//计数
			count++;
			//判断 是否换行
			if(count == 7){
				System.out.println(); //换行
				count = 0;
			} else {
				System.out.print("\t");
			}
		}
		//over
		System.out.println("\n________________________________________");
	}
}


