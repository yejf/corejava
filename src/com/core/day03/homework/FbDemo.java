/**
 * 
 */
package com.core.day03.homework;

import java.util.Scanner;

/**
 * @author 顾文
 *
 */
public class FbDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入斐波那契数列的长度：");
		int n = sc.nextInt();
		FbDemo fd = new FbDemo();
		fd.printFbnq(n);
		sc.close();
	}
	
	public void printFbnq(int n){
		int a = 0;
		int b = 1;
		int c = 0;
		if(n < 1){
			System.out.println("输入不合法！");
		}
		else if(n == 1){
			System.out.printf("%-4d",b);
		}else{
			System.out.printf("%-4d",b);
			for(int i = 2;i <= n;i++){
				c = a + b;
				System.out.printf("%d ",c);
				a =b;
				b = c;
			}
		}
	}
}
