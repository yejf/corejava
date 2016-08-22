/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day03;

/**
 * @author yejf
 *
 */
public class PrimeDemo {

	/*****
	 * 打印输出指定范围内的所有质数
	 * @param min 最小值
	 * @param max 最大值
	 */
	public void printPrime(int min, int max){
		//参数效性的判断
		if(min <= 1){
			min = 2; // 最小的质数是2
		}
		if(min >= max){
			System.out.println(":(范围不合法,程序退出...");
			return ;
		}
		//定义变量来保存质数的个数
		int count = 0;
		//循环
		for(int i = min; i<=max; i++){
			//判断每个变量因子是否是一个质数
			if(this.isPrime(i)){
				//说明是一个质数，那就输出
				count++;
//				System.out.print(i+" ");
				System.out.printf("%4d",i);
				//判断是否要换行
				if(count % 10 == 0){
					//换行
					System.out.println();
				}
			}
		}
		//输出共计有多个少质数
		System.out.println("\n\n在【"+min+"~"+max+
							"】范围中有"+count+"个质数.");
	}
	
	/*****
	 * 判断 整数n是否是一个质数
	 * @param n 
	 * @return 是，就返回true,否则，返回 false
	 */
	public boolean isPrime(int n){
		//假设这个数是质数
		boolean prime = true;
		//再通过循环来验证
		for(int i=2;i <= Math.sqrt(n);i++){
			if(n % i == 0){
				prime = false; //不是质数
				break; //打破循环
			}
		}
		return prime;
	}
}
