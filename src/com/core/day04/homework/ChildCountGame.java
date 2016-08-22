/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day04.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author yejf
 *
 */
public class ChildCountGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入小孩数量>");
		int child = sc.nextInt();
		System.out.println("请输入要报的数>");
		int n = sc.nextInt();
		//创建对象
		ChildCountGame ccg = new ChildCountGame();
		//调用方法
		//a. 得到所有小孩的数组
		int[] childs = ccg.getChilds(child);
		//先输出小孩的编号
		System.out.printf("出列前：%s\n",Arrays.toString(childs));
		//b. 出列游戏
		int[] result = ccg.getOutOfLine(childs, n);
		//
		System.out.printf("出列顺序：%s\n",Arrays.toString(result));
		//
		sc.close();
	}
	
	/****
	 * 获取存放小孩的数组
	 * @param child 小孩的数量
	 * @return
	 */
	public int[] getChilds(int child){
		//
		int[] arr = new int[child];
		//给小孩编号
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		//返回
		return arr;
	}
	
	/*****
	 * 报数出列游戏 
	 * @param childs 存放了小孩的数组
	 * @param n	 需要报的数字
	 * @return	返回出列顺序的数组
	 */
	public int[] getOutOfLine(int[] childs, int n){
		//定义一个常量元素值，表示已出列的无效元素
		final int INVALID_ELEMENT = 0;
		int[] outArr = new int[childs.length];
		//此处...
		int inChild = childs.length; //未出列的小孩数量
		int count = 0; //用来计数
		//循环
		while(inChild > 0){
			//...
			for(int i=0;i<childs.length;i++){
				//有条件的计数
				if(childs[i] != INVALID_ELEMENT){
					count++;
				}
				//判断这个计数是否已经达到了目标数字
				if(count == n){
					//a. 出列，把此小孩 编号存放到outArr中
					outArr[outArr.length-inChild] = childs[i];
					//b. 把此下标对应元素值置无效的元素值
					childs[i] = INVALID_ELEMENT;
					//c. 未出列的小孩 数量减1
					inChild--;
					//d. 计数器请0
					count = 0;
				}
			}
			
		}
		//返回
		return outArr;
	}

}


