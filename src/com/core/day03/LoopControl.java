/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
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
				//���û�ѡ���� break����continue
				System.out.print("����Ҫִ��break��");
				isBreak = sc.nextBoolean();
				if(isBreak){
					System.out.println("\n�˳�ѭ��");
					break;
				}else{
					//ִ��continue
					System.out.println("\n�̳���һ��ѭ��");
					continue;
				}
			}
			//��� i��ֵ
			System.out.println("i = "+i);
		}
		//
		sc.close();
	}

}
