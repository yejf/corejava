/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day09;

/**
 * @author yejf
 *
 */
public class TestCallBack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//创建一个Button
		Button b = new Button("弹出对话框");
		//创建一个动作
		Action a = new PopupAction();
		//
		b.click(a);
	}

}
