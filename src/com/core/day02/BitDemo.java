/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day02;

import java.util.Scanner;

/**
 * @author yejf
 *
 */
public class BitDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������>");
		//��������������û�������
		int i = sc.nextInt();
		//�ֱ���÷��������������ת����8��16��2�����ַ�����ʽ
		String iBin = Integer.toBinaryString(i);
		String iOct = Integer.toOctalString(i);
		String iHex = Integer.toHexString(i);
		//�ֱ����
		System.out.println(i+"�Ķ������ǣ�"+iBin);
		System.out.println(i+"�İ˽����ǣ�"+iOct);
		System.out.println(i+"��ʮ�������ǣ�"+iHex);
		
		//�ͷ���Դ
		sc.close();
	}

}

