/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
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
		//����һ��Button
		Button b = new Button("�����Ի���");
		//����һ������
		Action a = new PopupAction();
		//
		b.click(a);
	}

}
