/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day03;

/**
 * @author yejf
 *
 */
public class RecursiveDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RecursiveDemo rd = new RecursiveDemo();
		//���÷���
		int i = 10;
		long result = rd.factor(i);
		//
		System.out.println(i+"�Ľ׳��ǣ�"+result);
		
	}
	
	/******
	 * ���õݹ��㷨�����ָ�������Ľ׳�
	 * @param n
	 * @return
	 */
	public long factor(int n){
		System.out.println("���ڼ���"+n+"�Ľ׳�...");
		//1. ָ���˳�����
		if(n == 1){
			System.out.println("\t����1�Ľ׳�...");
			return 1L;
		}
		//2. �ҳ����ɣ��ݹ����
		long r = n * factor(n - 1);
		System.out.println("\t��������"+n+"�Ľ׳ˣ�"+r);
		return r;
	}

}


