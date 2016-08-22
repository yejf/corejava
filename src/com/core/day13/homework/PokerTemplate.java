/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
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
	 * ȷ�����Ƶ�����
	 * 	��ȡ��
	 * 		-> ϴ��
	 * 			  -> ����
	 */
	public static void start() {
		//
		Poker p = new Poker();
//		Scanner sc = new Scanner(System.in);
		int choice = -1;
		do {
			printMenu();
			choice = inputInt("��ѡ��>");
			//
			switch (choice) {
			case 1:
				play(p);
				break;
			case 0:
				System.out.println(":)�˳�...");
				break;
			default:
				System.out.println("������Ϸ�..");
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
				System.out.printf("\rϴ����...%-2d",i+1);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		p.shuffle(poker);
		//3. ����
		int person = inputInt("\n����������>");
		
		int cards = inputInt("\nÿ�˷�����>");
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
			System.out.printf("��������: %s\n",temp);
			return input(sc, msg);
		}
	}

	private static void printMenu() {
		System.out.println("*****************");
		System.out.println("*1 -> ����һ��  *");
		System.out.println("*0 -> �˳�      *");
		System.out.println("*****************");
	}
}
