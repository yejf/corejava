/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day03;

/**
 * @author yejf
 *
 */
public class MethodDemo {

	/**
	 * 主方法,也就是程序的入口
	 * @param args
	 */
	public static void main(String[] args) {
		//创建MethodDemo对象
		MethodDemo md = new MethodDemo();
		//调用sayHello方法
		md.sayHello("周芷若");
		
		System.out.println("=====分割线======");
		//调用 getName方法
		String result = md.getName();
		//注：拿到方法的结果，不一定总是打印输出，而是做为另一个方法的输入
//		System.out.println(result);
		md.sayHello(result);
	}

	/****
	 * 获取姓名的方法
	 * @return 返回一个名字
	 */
	public String getName(){
		//将来可以自主实现更为复杂的逻辑
		//...
		String name = "张三丰";
//		System.out.println(name);
		return name;
	}
	
	/******
	 * 打招呼的方法
	 * @param name
	 */
	public void sayHello(String name){
		//同样，可以自主实现更为复杂的逻辑
		//...
		System.out.println("你好,"+name);
	}
}




