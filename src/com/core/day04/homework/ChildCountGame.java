/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day04.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author yejf
 *
 */
public class ChildCountGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);
		System.out.println("������С������>");
		int child = sc.nextInt();
		System.out.println("������Ҫ������>");
		int n = sc.nextInt();
		//��������
		ChildCountGame ccg = new ChildCountGame();
		//���÷���
		//a. �õ�����С��������
		int[] childs = ccg.getChilds(child);
		//�����С���ı��
		System.out.printf("����ǰ��%s\n",Arrays.toString(childs));
		//b. ������Ϸ
		int[] result = ccg.getOutOfLine(childs, n);
		//
		System.out.printf("����˳��%s\n",Arrays.toString(result));
		//
		sc.close();
	}
	
	/****
	 * ��ȡ���С��������
	 * @param child С��������
	 * @return
	 */
	public int[] getChilds(int child){
		//
		int[] arr = new int[child];
		//��С�����
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		//����
		return arr;
	}
	
	/*****
	 * ����������Ϸ 
	 * @param childs �����С��������
	 * @param n	 ��Ҫ��������
	 * @return	���س���˳�������
	 */
	public int[] getOutOfLine(int[] childs, int n){
		//����һ������Ԫ��ֵ����ʾ�ѳ��е���ЧԪ��
		final int INVALID_ELEMENT = 0;
		int[] outArr = new int[childs.length];
		//�˴�...
		int inChild = childs.length; //δ���е�С������
		int count = 0; //��������
		//ѭ��
		while(inChild > 0){
			//...
			for(int i=0;i<childs.length;i++){
				//�������ļ���
				if(childs[i] != INVALID_ELEMENT){
					count++;
				}
				//�ж���������Ƿ��Ѿ��ﵽ��Ŀ������
				if(count == n){
					//a. ���У��Ѵ�С�� ��Ŵ�ŵ�outArr��
					outArr[outArr.length-inChild] = childs[i];
					//b. �Ѵ��±��ӦԪ��ֵ����Ч��Ԫ��ֵ
					childs[i] = INVALID_ELEMENT;
					//c. δ���е�С�� ������1
					inChild--;
					//d. ��������0
					count = 0;
				}
			}
			
		}
		//����
		return outArr;
	}

}


