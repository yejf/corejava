/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day09;

/**
 * @author yejf
 *
 */
public class Button {
	
	private String text = ""; //按钮上的文字
	
	public Button(String text) {
		super();
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	/****
	 * 当单击此按钮时该 干什么
	 * @param a
	 */
	public void click(Action a) {
		System.out.printf("按钮[%s]被单击了.\n",text);
		//回调用户指定的动作
		a.doIt("按钮");
		//
		System.out.println("执行结束...");
	}
}
