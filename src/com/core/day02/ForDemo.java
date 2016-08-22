/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day02;

/**
 * @author yejf
 *
 */
public class ForDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//循环5次
		for (int i = 0; i < 5; i++) {
			System.out.println("i = "+i);
		}
		//倒置
		for (int i = 4; i >= 0 ; i--) {
			System.out.println("i = "+i);
		}
		//
		System.out.println("---分割线---");
		//输出9*9法则表
		for(int i=1;i<=9;i++){
			//
			for(int j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+i*j+" ");
			}
			System.out.println();
		}
		
	}

}
