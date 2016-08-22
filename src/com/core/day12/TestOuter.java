/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day12;

import com.core.day12.Outer.Inner;

/**
 * @author yejf
 *
 */
public class TestOuter {

	public static void main(String[] args) {
		//创建外部类对象
		SpiderMan p = new SpiderMan("Peter", true);
		//
		p.run();
		
		//通过外部对象来创建内部类对象
//		Spider s = p.new SpiderDNA();
		/*Spider s = p.getDna();
		//
		s.run();*/
		
		//
		Outer o = new Outer();
		//创建静态内部类对明
		Inner i = new Inner();
		i.print();
		System.out.println("======================");
		o.localMethod();
	}
}
