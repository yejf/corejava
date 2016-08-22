/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day06;

/**
 * @author yejf
 *
 */
public class TestAnimals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//创建一只小鸟
		Bird b = new Bird("鸵鸟", false);
		//调用父类的方法
		b.shout();
		//也可以调用自己的方法
		b.fly();
		
		System.out.println("-------分割线----------");
		//创建 Dog对象
		Dog d = new Dog("狼狗", 22);
		//调用父类的方法
		d.shout();
		//也可以调用自己的方法
		d.eatBone();
	}

}
