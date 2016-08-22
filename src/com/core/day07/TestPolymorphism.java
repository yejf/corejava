/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day07;

/**
 * 多态的测试
 * @author yejf
 *
 */
public class TestPolymorphism {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//面向父类编程, 对象的编译时类型尽可能地父类
		Shape c = new Circle("圆形", 6.2);
		Shape r = new Rectangle("矩形", 5.6, 4.8);
		
		//创建一个Shape类型的数组来存放所有的形状对象
		Shape[] sarr = new Shape[]{c,r};
		
		//调用相同的方法，查看两个对象的形为
		for(Shape s : sarr){
			System.out.printf("%s的面积:%.2f,周长:%.2f\n",
								s.getName(),s.area(),s.girth());
		}
		
	}

}
