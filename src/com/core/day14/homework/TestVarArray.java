/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day14.homework;

/**
 * 
 * @author 何子乾
 * 2016年7月20日 下午9:26:58
 */
public class TestVarArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//创建VarArray对象
		VarArray<Integer> va = new VarArray<>();
		//循环添加数据
		va.add(49);
		va.add(66);
		va.add(78);
		va.add(55);
		//
		va.showAllElement();
		//
		va.remove(66);
		System.out.printf("当前的有效元素个数：%d\n",va.length());
		va.showAllElement();
		
		va.update(0, 100);
		va.showAllElement();
		//将数组设置为字符串类型
		VarArray<String> va2 = new VarArray<>();
		va2.add("start");
		va2.add("end");
		va2.add("process");
		va2.add("result");
		va2.showAllElement();
		va2.remove("process");
		System.out.printf("当前的有效元素个数：%d\n",va2.length());
		va2.showAllElement();
		
		}
	}


