
package com.core.day18.homework;

import java.lang.reflect.Array;

public class PrintArray {
	public static void main(String[] args) {
		//一维数组
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		System.out.println(toString(arr));

        //二维数组
		int[][] brr = new int[3][5];
		for (int i = 0; i < brr.length; i++) {
			for (int j = 0; j < brr.length; j++) {
				brr[i][j] = i + j;
			}
		}
		System.out.println(toString(brr));
	}


	public static String toString(Object array) {
		Class<?> c = array.getClass();
		StringBuilder builder = new StringBuilder();
		builder.append("[");

        //判断是否是数组
		if (c.isArray()) {
			int length = Array.getLength(array);
			for (int j = 0; j < length; j++) {
				Object arrobj = Array.get(array, j);
				Class<?> cl = arrobj.getClass();
				if (cl.isArray()) {
					builder.append(toString(arrobj));
					/*if (j != length - 1) {
						builder.append(",");
					}*/
				} else {
					builder.append(arrobj);
					
				}
				if (j != length - 1) {
					builder.append(",");
				}
			}

		}
		builder.append("]");
		return builder.toString();

	}
}
