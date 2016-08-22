/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day13;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yejf
 *
 */
public class TestSubList {

	public static void main(String[] args) {
		List<String> original = new ArrayList<>();
		//添加一些数据到此集合中
		original.add("jack");
		original.add("john");
		original.add("solo");
		original.add("rose");
		original.add("LiLei");
		original.add("HanMeiMei");
		
		//输出
		for(String s : original){
			System.out.println(s);
		}
		System.out.println("共计："+original.size());
		//利用 subList
		List<String> sub = original.subList(1, 4);
		//输出sub的类型
		System.out.println(sub.getClass());
		//输出sub的内容
		System.out.println("sub中的内容：");
		for(String s : sub) {
			System.out.println(s);
		}
		System.out.println("sub 中共计："+sub.size());
		//利用 sub 重新创建一个 ArrayList
		List<String> nsub = new ArrayList<>(sub);
		
		//
		sub.clear(); //这会影响 original
		System.out.println("clear之后 original的大小:"+original.size());
		
		System.out.println("=== nsub的内容：");
		//nsub会有影响吗？
		for(String s : nsub) {
			System.out.println(s);
		}
		
		//nsub和original 是完全两个独立的集合。
		//它们所有结构性的操作都互不影响，但是：
		
		nsub.set(0, "hehe");
		//查看，original 
		System.out.println(">>> orignal 值：");
		for(String s : original) {
			System.out.println(s);
		}
		
		System.out.println(">>> nsub 值：");
		for(String s : nsub) {
			System.out.println(s);
		}
		
		//可以发现，original没有变化，因为String是不变对象。
		//如果换成其它的对像，就会有所变化。
	}
}
