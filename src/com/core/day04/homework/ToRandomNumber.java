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
public class ToRandomNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ����������ĸ���>");
		int length = sc.nextInt();
		System.out.println("\t��Χ>");
		int n = sc.nextInt();
		
		ToRandomNumber trn = new ToRandomNumber();
//		trn.toRandomNebber(length);
		int[] result = trn.randomCount(length, n);
		//
		for (int i = 0; i < result.length; i++) {
			System.out.printf("����%d������:%d��\n",i+1,result[i]);
		}
		sc.close();
	}

	/**
	 * ���������
	 * 
	 * @param length����������ĳ���
	 * @return����length���ȵ������������
	 */
	public void toRandomNebber(int length) {
		Random sr = new Random();
		int[] r = new int[length];
		for (int i = 0; i < r.length; i++) {
			r[i] = sr.nextInt(50) + 1;
		}
		this.judgeIntString(r);
	}
	
	/***
	 * ͳ������times��1~max֮�����������Գ��ֵĴ���
	 * @param times ������ĸ���
	 * @param max	�����������
	 * @return
	 */
	public int[] randomCount(int times,int max){
		Random r = new Random();
		int[] arr = new int[max];
		//ѭ�������������
		for(int i=0;i<times;i++){
			int t = r.nextInt(max)+1;
			//���t�������±�֮��Ĺ�ϵ�ǣ��±�=t-1
			arr[t-1]++;
		}
		return arr;
	}

	/**
	 * �жϴ�����������ͬԪ�صĸ���
	 * 
	 * @param r���������
	 */
	public void judgeIntString(int[] r) {
		for (int i = 1; i <= 50; i++) {
			int count = 0;
			for (int j = 0; j < r.length; j++) {
				if (i == r[j])
					count++;
			}
			System.out.printf("%-2d:���ֵĴ���Ϊ%d:\n", i, count);
		}
	}

}
