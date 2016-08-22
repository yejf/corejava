/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
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
		System.out.print("请输入长度》");
		int len = sc.nextInt();
		//
		int[] result = ae.getRandomArray(len);
		//打印输出这个数组
		System.out.printf("result:%s\n",Arrays.toString(result));
		
		//做一次copy
		int[] arr = new int[result.length+1];
		System.out.printf("arr:%s\n",Arrays.toString(arr));
		
		System.arraycopy(result, 0, arr, 0, result.length);
		System.out.println("After Copy....");
		System.out.printf("arr:%s\n",Arrays.toString(arr));
		
		//填充
		Arrays.fill(arr, 1);
		System.out.println("After fill ...");
		System.out.printf("arr:%s\n",Arrays.toString(arr));
		
		//为 result排序 
//		Arrays.sort(result);
		
		ae.bubbleSort(result);
		
		System.out.println("Result Arrays sorted ....");
		System.out.printf("result:%s\n",Arrays.toString(result));
		
		//做二分法搜索
		System.out.printf("\n请输入你要查询的元素>");
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
	 * 生成指定长度个数的1~100的随机数数组。
	 * @param length 长度
	 * @return 填充了1~100元素值的整型数组
	 */
	public int[] getRandomArray(int length){
		int[] arr = new int[length];
		//利用随机数来填充数组元素
		Random r = new Random();
		//循环
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100)+1;
		}
		//返回
		return arr;
	}

	/****
	 * 冒泡排序算法
	 * @param arr
	 */
	public void bubbleSort(int[] arr){
		//外层循环控制整体元素
		for (int i = 0; i < arr.length - 1; i++) {
			//内层循环每次找一个最小的元素
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[i]){
					//交换
					arr[i] ^= arr[j];
					arr[j] ^= arr[i];
					arr[i] ^= arr[j];
				}
			}
		}
	}
	
}



