/**
 * �������XXX��˾���У�δ����ɣ�����ת�������ơ�
 */
package com.core.day04.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ����
 *
 */
public class CircleDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CircleDemo cd = new CircleDemo();
		System.out.println("������С���ĸ����ͱ��������");
		int m = sc.nextInt();
		int n = sc.nextInt();
		cd.circleMethod(m, n);
		sc.close();
	}

	public void circleMethod(int m, int n) {
		int[] circle = new int[m];// ���m����
		int[] result = new int[m];// ��¼�˳�˳��
		int k = 0;

		// ��������ÿһ������ֵ1
		for (int i = 0; i < circle.length; i++) {
			circle[i] = 1;
		}

		System.out.printf("%s\n", Arrays.toString(circle));

		int times = 0;

		for (int i = 0; m > 0;) {
			if (circle[i] == 1) {
				times++;
				if (times == n) {
					result[k++] = i + 1;
					circle[i] = 0;
					times = 0;
					m--;
				}
				i++;
			} else {
				i++;
			}
			if (i >= circle.length) {
				i %= circle.length;
			}
		}
		System.out.printf("\n�˳�˳��Ϊ��%s", Arrays.toString(result));

	}

}
