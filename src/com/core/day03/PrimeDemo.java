/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day03;

/**
 * @author yejf
 *
 */
public class PrimeDemo {

	/*****
	 * ��ӡ���ָ����Χ�ڵ���������
	 * @param min ��Сֵ
	 * @param max ���ֵ
	 */
	public void printPrime(int min, int max){
		//����Ч�Ե��ж�
		if(min <= 1){
			min = 2; // ��С��������2
		}
		if(min >= max){
			System.out.println(":(��Χ���Ϸ�,�����˳�...");
			return ;
		}
		//������������������ĸ���
		int count = 0;
		//ѭ��
		for(int i = min; i<=max; i++){
			//�ж�ÿ�����������Ƿ���һ������
			if(this.isPrime(i)){
				//˵����һ���������Ǿ����
				count++;
//				System.out.print(i+" ");
				System.out.printf("%4d",i);
				//�ж��Ƿ�Ҫ����
				if(count % 10 == 0){
					//����
					System.out.println();
				}
			}
		}
		//��������ж��������
		System.out.println("\n\n�ڡ�"+min+"~"+max+
							"����Χ����"+count+"������.");
	}
	
	/*****
	 * �ж� ����n�Ƿ���һ������
	 * @param n 
	 * @return �ǣ��ͷ���true,���򣬷��� false
	 */
	public boolean isPrime(int n){
		//���������������
		boolean prime = true;
		//��ͨ��ѭ������֤
		for(int i=2;i <= Math.sqrt(n);i++){
			if(n % i == 0){
				prime = false; //��������
				break; //����ѭ��
			}
		}
		return prime;
	}
}
