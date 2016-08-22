/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day03;

import java.util.Scanner;

/**
 * @author yejf
 *
 */
public class LoopControl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isBreak = false;
		//
		for (int i = 1; i <= 9; i++) {
			if(i % 3 == 0){
				//让用户选择是 break还是continue
				System.out.print("请问要执行break吗？");
				isBreak = sc.nextBoolean();
				if(isBreak){
					System.out.println("\n退出循环");
					break;
				}else{
					//执行continue
					System.out.println("\n继承下一轮循环");
					continue;
				}
			}
			//输出 i的值
			System.out.println("i = "+i);
		}
		//
		sc.close();
	}

}
