/**
 * 本代码归我所有，唯吾独尊
 */
package com.core.day05.homework;


/**
 * @author 陈林
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c1=new Computer();
		Computer c2=new Computer();
		Screen s1=new Screen();
		//
		s1.setPinPaiScreen("lenovo");
		s1.setSize(23);
		s1.setKind("LCD");
		//
		c1.setPinPai("lenveo");
		c1.setPrice(4000);
		c1.setScreen(s1);
		//
		c2.setPinPai("acer");
		c2.setPrice(4598);
		c2.setScreen(null);
		System.out.printf("%s%10s%25s%4s%7s\n","电脑品牌","单价","显示器品牌","大小","类型");
		
		c1.show();
		c2.show();
	}

}
