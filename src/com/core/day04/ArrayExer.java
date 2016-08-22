/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author yejf
 *
 */
public class ArrayExer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//create object
		Scanner sc = new Scanner(System.in);
		ArrayExer ae = new ArrayExer();
		System.out.print("�����볤�ȡ�");
		int len = sc.nextInt();
		//
		int[] result = ae.getRandomArray(len);
		//��ӡ����������
		System.out.printf("result:%s\n",Arrays.toString(result));
		
		//��һ��copy
		int[] arr = new int[result.length+1];
		System.out.printf("arr:%s\n",Arrays.toString(arr));
		
		System.arraycopy(result, 0, arr, 0, result.length);
		System.out.println("After Copy....");
		System.out.printf("arr:%s\n",Arrays.toString(arr));
		
		//���
		Arrays.fill(arr, 1);
		System.out.println("After fill ...");
		System.out.printf("arr:%s\n",Arrays.toString(arr));
		
		//Ϊ result���� 
//		Arrays.sort(result);
		
		ae.bubbleSort(result);
		
		System.out.println("Result Arrays sorted ....");
		System.out.printf("result:%s\n",Arrays.toString(result));
		
		//�����ַ�����
		System.out.printf("\n��������Ҫ��ѯ��Ԫ��>");
		int target = sc.nextInt();
		//
		int index = Arrays.binarySearch(result, target);
		if(index < 0){
			System.out.println("\n\tSorry, not found!");
		}else{
			System.out.printf("\n\tGot it! the position is: %d\n",index);
		}
		
		sc.close();
	}
	
	/*****
	 * ����ָ�����ȸ�����1~100����������顣
	 * @param length ����
	 * @return �����1~100Ԫ��ֵ����������
	 */
	public int[] getRandomArray(int length){
		int[] arr = new int[length];
		//������������������Ԫ��
		Random r = new Random();
		//ѭ��
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100)+1;
		}
		//����
		return arr;
	}

	/****
	 * ð�������㷨
	 * @param arr
	 */
	public void bubbleSort(int[] arr){
		//���ѭ����������Ԫ��
		for (int i = 0; i < arr.length - 1; i++) {
			//�ڲ�ѭ��ÿ����һ����С��Ԫ��
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[i]){
					//����
					arr[i] ^= arr[j];
					arr[j] ^= arr[i];
					arr[i] ^= arr[j];
				}
			}
		}
	}
	
}



