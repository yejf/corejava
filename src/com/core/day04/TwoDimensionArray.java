/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day04;

/**
 * @author yejf
 *
 */
public class TwoDimensionArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//����һ������Ķ�ά����
		int[][] arr = new int[19][19];
		//��ӡ����
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%-2d",arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("===== �ָ��� ======");
		//����һ��������Ķ�ά����
		int[][] brr = new int[7][];
		//��ӡ����
		for (int i = 0; i < brr.length; i++) {
			//��һ����ʼ����ά�����Ԫ��
			brr[i] = new int[i+1];
			for (int j = 0; j < brr[i].length; j++) {
				//��ֵ
				brr[i][j] = j+1;
				System.out.printf("%-2d",brr[i][j]);
			}
			System.out.println();
		}
	}

}
