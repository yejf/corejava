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
		System.out.println("����[1,100]֮���������һ������");
		g1.creatNumber();
		int a;
		do{
			a=sc.nextInt();
			g1.play(a);
		}while(a!=g1.getNumber());
		System.out.printf("��һ������%d��",g1.getCount());
		
	}

}
