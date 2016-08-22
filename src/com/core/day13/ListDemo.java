/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author yejf
 *
 */
public class ListDemo {

	public static void main(String[] args) {
		//创建一个List对象
		List strList = new ArrayList();
		//没有使用泛型前，这个集合中可以放任意 类型的对象
		strList.add("葛青青");
		strList.add("曹文靖");
		strList.add("葛宏");
		strList.add("王军");
		//查看当前集合中元素的个数
		System.out.printf("集合中元素的个数：%d\n",strList.size());
		strList.add("马来来");
		System.out.printf("集合中元素的个数：%d\n",strList.size());
		//移除
		String obj = (String) strList.remove(1);//
		
		System.out.printf("%s 被移动了.\n",obj);
		System.out.printf("集合中元素的个数：%d\n",strList.size());
		if(strList.remove("王军")){
			System.out.printf("%s 被移除了.\n","王军");
		}
		System.out.printf("集合中元素的个数：%d\n",strList.size());
		
		//
		strList.set(2, "张三丰"); //修改
		
		System.out.println("--- 使用foreach增强for循环来遍历");
		//遍历
		for(Object o : strList) {
			System.out.printf("%s\n", o);
		}
		
		System.out.println("--- 使用迭代器来遍历");
		//1.获取迭代器
		Iterator iter = strList.iterator();
		while(iter.hasNext()) {
			//
			String o = (String) iter.next(); //取出元素
			System.out.printf("%s\n",o);
		}
		//
		strList.clear(); //清空整个元素
		System.out.printf("集合中元素的个数：%d\n",strList.size());
		
	}
}
