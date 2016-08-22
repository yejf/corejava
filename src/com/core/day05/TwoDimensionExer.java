/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day05;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author yejf
 *
 */
public class TwoDimensionExer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������>");
		int level = sc.nextInt();
		//
		TwoDimensionExer tde = new TwoDimensionExer();
		int[][] yh = tde.yhTriangle(level);
		//
		for (int i = 0; i < yh.length; i++) {
			System.out.printf("%s\n",Arrays.toString(yh[i]));
		}
		//
		sc.close();
	}

	/*****
	 * ���ö�ά���������ָ����ε�������� ���� ������� �������£� A).�����еĵ�1�к����1�ж���1
	 * B).����֮�������ֵ����һ�е�ͬ�к�ǰһ��֮�͡�
	 * 
	 * @param level
	 * @return
	 */
	public int[][] yhTriangle(int level) {
		// ����һ����ά����
		int[][] yh = new int[level][];
		// �㷨
		for (int i = 0; i < yh.length; i++) {
			// ��һ����ʼ������Ԫ��
			yh[i] = new int[i + 1];
			// �ڲ�ѭ��
			for (int j = 0; j < yh[i].length; j++) {
				// ����������ǵĹ�����ȷ��Ԫ��ֵ��
				// �����еĵ�1�к����1�ж���1
				if (j == 0 || j == i) {
					yh[i][j] = 1;
				} else {
					yh[i][j] = yh[i - 1][j] + yh[i - 1][j - 1];
				}
			}
		}
		// ����
		return yh;
	}

}
