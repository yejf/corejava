package com.core.day17;

/******
 * 利用ThreadLocal 来封装一个线程的变量，以使用这个变量与线程绑定
 * 一个线程拥有一个变量，互不影响
 * @author yejf
 *
 */
public class IntegerThreadLocal {

	private static ThreadLocal<Integer> map = 
								new ThreadLocal<>();
	
	/*****
	 * 通过ThreadLocal来返回目标数据
	 * @return
	 */
	public static Integer getInt() {
		//首先，根据当前线程来匹配
		Integer value = map.get();
		//判断
		if(value == null) {
			value = new Integer(1);
		}
		//把value+1的值设回去
		map.set(value+1);
		//返回
		return value;
	}
}

