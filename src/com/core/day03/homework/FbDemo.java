/**
 * 
 */
package com.core.day03.homework;

import java.util.Scanner;

/**
 * @author ����
 *
 */
public class FbDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������쳲��������еĳ��ȣ�");
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
			System.out.println("���벻�Ϸ���");
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
