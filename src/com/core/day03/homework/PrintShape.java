/**
 * 
 */
package com.core.day03.homework;

import java.util.Scanner;

/**
 * @author ����
 *
 */
public class PrintShape {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		PrintShape ps = new PrintShape();
		int choice = -1;
		do {
			System.out.println("========================");
			System.out.println("= 1 -> ֱ��������");
			System.out.println("= 2 -> ����");
			System.out.println("= 3 -> ����");
			System.out.println("= 4 -> ����");
			System.out.println("= 5 -> ����������");
			System.out.println("= 0 -> �˳�");
			System.out.println("========================");
			
			System.out.print("��ѡ��>");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("������ֱ�������εĸ߶�:");
				int n = sc.nextInt();
				ps.HomeWork1(n);
				break;
			case 2:
				System.out.println("�����볤�͸ߣ�");
				int a = sc.nextInt();
				int b = sc.nextInt();
				ps.HomeWork2(a, b);
				break;
			case 3:
				System.out.println("�����������");
				int m = sc.nextInt();
				ps.HomeWork3(m);
				break;
			case 4:
				ps.HomeWork4();
				break;
			case 5:
				ps.HomeWork5();
				break;
			case 0:
				System.out.println(":)ллʹ�ã�");
				break;
			default:
			System.out.println(":(���벻�Ϸ�!");
			break;
			}
		}while (choice != 0);
		sc.close();
	}

	public void HomeWork1(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (j == 1 || i == n || i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public void HomeWork2(int a,int b) {
		for (int i = 1;i <= b;i++) {
			for (int j = 1;j <= a;j++) {
				if(i == 1 || i == b || j == 1 || j == a){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}System.out.println();
		}
	}
	
	public void HomeWork3(int m){
		if((m & 1) == 0 || m < 5){
			System.out.println("���벻�Ϸ�!");
		}else{
		for(int i = 1;i <= m/2+1;i++) {
			for(int j = 1;j <= m/2+1-i;j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j = 1;j <= 2*(i-2)+1;j++) {
				System.out.print(" ");
			}
			if(i != 1) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = m/2;i >= 1;i--) {
			for(int j = 1;j <= ((m/2)-i+1);j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j = 1;j <= (2*(i-2)+1);j++) {
				System.out.print(" ");
			}
			if(i != 1) {
				System.out.print("*");
			}
			System.out.println();
		}
		}
	}
	
	public void HomeWork4(){
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= (int) (Math.pow(2, 3 - i)); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (6 * i - (i * (i + 1)) / 2); j++) {
				System.out.print("*");
			}
			for (int j = 1; j <= (9 - (i - 1) * 4); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (6 * i - (i * (i + 1)) / 2); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 27; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (27 - 2 * i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= (2 * i + 4); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (19 - 4 * i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("             *");
	}
	
	public void HomeWork5(){
		for(int i = 1;i <= 6;i++){
			for(int j = 1;j <= i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i = 1;i <= 6;i++){
			for(int j = 1;j <= 6 - i;j++){
				System.out.print("  ");
			}
			for(int j = i;j >= 1;j--){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
