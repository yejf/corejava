/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day06;

import java.util.Arrays;

/**
 * ��������ʾ�������ݵĹ���
 * @author yejf
 *
 */
public class ParameterTransferDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 100;
		add(n);
		System.out.printf("n = %d\n",n);
		//
		int[] arr = new int[]{1,2,3};
		System.out.printf("����ǰ��%s\n",Arrays.toString(arr));
		add(arr);
		System.out.printf("������%s\n",Arrays.toString(arr));
	}
	
	/****
	 * �������͵Ĳ������ݵ���ֵ����
	 * @param a
	 */
	public static void add(int a){
		a++;
	}
	
	/***
	 * �������ʹ��ݵ�������/��ַ
	 * @param a
	 */
	public static void add(int[] a){
		for (int i = 0; i < a.length; i++) {
			a[i]++;
		}
	}
}
