/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day03;

/**
 * @author yejf
 *
 */
public class PrimeMain {

	/**
	 * 主方法
	 * @param args
	 */
	public static void main(String[] args) {
		//想要调用PrimeDemo类的printPrime方法，怎么办？
		//1.创建对象
		PrimeDemo pd = new PrimeDemo();
		//2.通过对象来调用方法 
		pd.printPrime(1, 300);
	}

}
