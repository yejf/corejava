/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day13.homework;

import java.util.List;
import java.util.Scanner;

/**
 * @author yejf
 *
 */
public class PokerTemplate {
	
	/*************
	 * 确定玩牌的流程
	 * 	获取牌
	 * 		-> 洗牌
	 * 			  -> 发牌
	 */
	public static void start() {
		//
		Poker p = new Poker();
//		Scanner sc = new Scanner(System.in);
		int choice = -1;
		do {
			printMenu();
			choice = inputInt("请选择>");
			//
			switch (choice) {
			case 1:
				play(p);
				break;
			case 0:
				System.out.println(":)退出...");
				break;
			default:
				System.out.println("输出不合法..");
				break;
			}
			
		} while (choice != 0);
		//
	}

	private static void play(Poker p) {
		//1. 
		List<Card> poker = p.getPoker();
		//2. 
		for(int i = 0;i<3;i++) {
			try {
				System.out.printf("\r洗牌中...%-2d",i+1);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		p.shuffle(poker);
		//3. 发牌
		int person = inputInt("\n请输入人数>");
		
		int cards = inputInt("\n每人发几张>");
		//
		p.play(poker, person, cards);
		
	}

	private static int inputInt(String msg) {
		Scanner sc = new Scanner(System.in);
		try {
			return input(sc,msg);
		} finally {
//			sc.close();
		}
		
	}
	
	private static int input(Scanner sc,String msg) {
		try {
			System.out.print(msg);
			int i = sc.nextInt();
			return i;
			
		}catch(RuntimeException e){
			String temp = sc.nextLine();
			System.out.printf("输入有误: %s\n",temp);
			return input(sc, msg);
		}
	}

	private static void printMenu() {
		System.out.println("*****************");
		System.out.println("*1 -> 再玩一局  *");
		System.out.println("*0 -> 退出      *");
		System.out.println("*****************");
	}
}
