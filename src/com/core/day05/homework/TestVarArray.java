/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day05.homework;

/**
 * @author yejf
 *
 */
public class TestVarArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//创建VarArray对象
		VarArray va = new VarArray();
		//循环添加数据
		for(int i=0;i<18;i++){
			va.add(i+1);
			System.out.printf("当前的有效元素个数：%d\n",va.length());
		}
		//
		va.showAllElement();
		//
		va.remove(10);
		System.out.printf("当前的有效元素个数：%d\n",va.length());
		va.showAllElement();
		
		va.update(5, 100);
		va.showAllElement();
		
		//自已来遍历此数组
		for(int i=0;i<va.length();i++){
			System.out.printf("%-4d",va.get(i));
		}
	}

}
