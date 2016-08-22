/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day08;

/**
 * @author yejf
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//模拟要使用交通工具
		//面向抽象编程
//		Movable m = new Plane(180, 540, "", "东方航空");
		
//		Movable m = MoveFactory.getInstance(180, 540, "东方航空");
		Movable m = MoveFactory.getInstance(1760, 220, null);
		//调用方法
		m.move(Movable.NORTH);
		//如果要对移动对象做进一步的处理，我们该如何？
		if(m instanceof CheckSpeed){
			if(m.getSpeed() >= 180) {
				System.out.printf("警告：你超速了.\n");
			}
		}
		
		
	}

}

