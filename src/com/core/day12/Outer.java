/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day12;

/**
 * @author yejf
 *
 */
public class Outer {

	//属性
	private int index = 150;
	
	private String message; 
	
	private static int i = 100;
	
	//静态内部类
	public static class Inner {
		//属性
		private int index; //属性名故意同外部类一样。
		
		//方法
		public void print() {
			System.out.println(this.index); //自己的
			System.out.println(Outer.i); //外部类的静态属性
//			System.out.println(message); //不能访问非静态成员
		}
	}
	
	//方法
	public void localMethod() {
		System.out.println("...执行外部类的localMethod方法...");
		final int index = 200; //常量
		//局部内部类
		/*class DNA implements Spider {
			@Override
			public void run() {
				//访问外部类的所有成员
				System.out.println("\t>>>局部常量 "+index); //局部优先
				System.out.println("\t>>>外部类属性："+Outer.this.index);//外部类属性
				
			}
		}
		//要创建这个内部类的对象
		Spider s = new DNA();
		//再调用s的方法
		System.out.println(" >>> 调用局部内部类的方法");
		s.run();*/
		
		System.out.println(" >>> 调用局部内部类的方法");
		//改写成匿名内部类
		new Spider() {
			@Override
			public void run() {
				//访问外部类的所有成员
				System.out.println("\t>>>局部常量 "+index); //局部优先
				System.out.println("\t>>>外部类属性："+Outer.this.index);//外部类属性
			}
		}.run();
		
		//
		//...
		System.out.println("... 回到外部类的localMethod方法中...");
	}
}
