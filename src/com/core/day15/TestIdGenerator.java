/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day15;

/**
 * @author yejf
 *
 */
public class TestIdGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long id = IdGenerator.generate();
		System.out.printf("当前id值：%d\n",id);
	}

}
