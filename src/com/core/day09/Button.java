/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day09;

/**
 * @author yejf
 *
 */
public class Button {
	
	private String text = ""; //��ť�ϵ�����
	
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
	 * �������˰�ťʱ�� ��ʲô
	 * @param a
	 */
	public void click(Action a) {
		System.out.printf("��ť[%s]��������.\n",text);
		//�ص��û�ָ���Ķ���
		a.doIt("��ť");
		//
		System.out.println("ִ�н���...");
	}
}
