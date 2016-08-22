/**
 * 
 */
package com.core.day06.homework;

import java.util.Scanner;

/**
 * @author dell
 *
 */
public class TestGuess {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Guess g1=new Guess();
		System.out.println("请在[1,100]之间随机输入一个数：");
		g1.creatNumber();
		int a;
		do{
			a=sc.nextInt();
			g1.play(a);
		}while(a!=g1.getNumber());
		System.out.printf("您一共猜啦%d次",g1.getCount());
		
	}

}
