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
public class BitOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);
		System.out.println("��������������>");
		//��������������û�������
		int i = sc.nextInt();
		//�õ��������Ķ������ַ���
		String iBin = Integer.toBinaryString(i);
		//���
		System.out.println(i+"�Ķ����ƣ�"+iBin);
		//
		System.out.println("\t������Ҫȡ���ĵ�λ��>");
		int n = sc.nextInt();
		//�������룬����λ��
		int mask = (1 << n) - 1;
		//����������
		System.out.println("�����ǣ�"+mask);
		//����
		int j = i ^ mask;
		//�õ�j�Ķ������ַ���
		String jBin = Integer.toBinaryString(j);
		//
		System.out.println(j+"�Ķ������ǣ�"+jBin);
		//
		sc.close();
		
		//���ڣ��ѱ���i��j��ֵ��ӡ����
		System.out.println("i = "+i);
		System.out.println("j = "+j);
		
		//����
		i = i ^ j;
		j = i ^ j;
		i = i ^ j;
		System.out.println("������");

		System.out.println("i = "+i);
		System.out.println("j = "+j);
	}

}
