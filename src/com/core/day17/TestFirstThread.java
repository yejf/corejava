/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day17;

/**
 * @author yejf
 *
 */
public class TestFirstThread {

	public static void main(String[] args) {
		//��ȡ��ǰ�߳���
		String name = Thread.currentThread().getName();
		System.out.printf("�߳� %s ����ִ��.\n",name);
		//�����̶߳���
		Thread t = new FirstThread();
		//����FirstThread
		t.start(); //����߳�ͬmain�߳�һ����Ҳ�������ں��߳���Դ
		//�ٴ���һ���̶߳���
		Runnable r = new MyRun();
		Thread tr = new Thread(r);
		//����tr �߳� 
		tr.start();
		
		try {
			t.join(); //main�߳�Ҫ�ȴ�t�߳̽������ٻ��������
			//
			tr.join();//�ȴ�tr����
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//��main�߳���Ҳ��ӡ10����
		for(int i = 100;i<110;i++) {
			System.out.printf("%s �ڴ�ӡ %d\n",name,i+1);
		}
		//
		System.out.printf("�߳� %s ���н���...\n",name);
	}
}

