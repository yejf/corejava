/**
 * 
 */
package com.core.day06.homework;

import java.util.Random;

/**
 * @author dell
 *
 */
public class Guess {
	private int number;
	private int count=0;
	public Guess() {
		super();
	}
	
	public int creatNumber(){
		Random r=new Random();
		return number=r.nextInt(100)+1;
	}
	public void play(int a){
		if(a==number){
			count++;
			
			System.out.printf("恭喜，你猜对啦\n");
		}else if(0<a&&a<number){
			count++;
			System.out.printf("你猜小啦。。。。。请重新输入\n");
		}else if(a>number&&a<100){
			count++;
			System.out.printf("你猜大啦。。。。。请重新输入\n");
		}else{
			count++;
			System.out.printf("输入不正确。。。。。请重新输入\n");
		}
	}
   
	public int getNumber() {
		return number;
	}

	public int getCount() {
		return count;
	}

}
