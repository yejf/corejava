/**
 * �������XXX��˾���У�δ����ɣ�����ת�������ơ�
 */
package com.core.day04.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author ����
 *
 */
public class DoubleColorBalls {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DoubleColorBalls dcb = new DoubleColorBalls();
		System.out.println("��������ҪͶע˫ɫ���ע��");
		int n = sc.nextInt();
		dcb.printBall(n);
		sc.close();
	}

	/**
	 * ����һע˫ɫ��
	 * 
	 * @return
	 */
	public int[] doubleColorBall() {
		Random r = new Random();
		int[] scb = new int[7];
		for (int i = 0; i <= 6; i++) {
			if (i <= 5) {
				scb[i] = r.nextInt(33) + 1;
				boolean b = true;
				for (int j = 0; j < i; j++) {
					b = (b && (scb[i] != scb[j]));
				}
				if (b == false) {
					i--;
				}
			} else {
				scb[i] = r.nextInt(16) + 1;
			}
		}
		return scb;

	}

	/**
	 * ��ӡ���nע˫ɫ��
	 * 
	 * @param n
	 */
	public void printBall(int n) {
		// ѭ��n�Σ����� doubleColorBall();

		for (int i = 1; i <= n; i++) {
			int[] scb = doubleColorBall();
			for (int j = 0; j <= 4; j++) {
				for (int k = j + 1; k <= 5; k++) {
					int c = 0;
					if (scb[j] > scb[k]) {
						c = scb[j];
						scb[j] = scb[k];
						scb[k] = c;
					}
				}
			}
			System.out.printf("��%-4dע˫ɫ���ǣ�%s\n", i, Arrays.toString(scb));
		}
	}

}
