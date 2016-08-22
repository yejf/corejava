/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 泛型案例
 * @author yejf
 *
 */
public class GenericDemo {

	public static void main(String[] args) {
		
//		List<Number> nList = new ArrayList<Integer>();
		List<Integer> iList = new ArrayList<>(); //7.0可以不写了
		iList.add(10);
		iList.add(45);
		iList.add(34);
		
		showList(iList);
		
		System.out.println("======================");
		//
		List<Long> aList = new LinkedList<>();
		aList.add(100L);
		aList.add(200L);
		aList.add(500L);
		//
		showList(aList);
		
		//
		List<String> bList = new ArrayList<>();
		bList.add("jack");
		bList.add("ann");
		bList.add("rose");
		//
		show(bList);
	}

	private static void showList(List<? extends Number> iList) {
		//
		for(Number i : iList) {
			System.out.println(i);
		}
	}
	
	/****
	 * 泛型方法
	 * @param list
	 */
	public static <T extends Comparable<? super T>> 
									void show(List<T> list) {
		for(T t : list) {
			System.out.println(t);
		}
	}
} 
