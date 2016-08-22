/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day12;

/**
 * @author yejf
 *
 */
public class TestEnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//获取Gender的一个枚举常量
		Gender m = Gender.MALE;
		System.out.println(m); //相当于m.toString();
		
		//如果要获取这个枚举的所有常量
		Gender[] all = Gender.values(); 
		for(Gender g : all) {
			System.out.printf
				("枚举常量名:%s, 序号:%d\n",g, g.ordinal());
		}
	}

}
