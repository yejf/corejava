/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day17;

/**
 * @author yejf
 *
 */
public class MyRun implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		//�ڴ���д���߳�ִ�еĴ���
		String name = Thread.currentThread().getName();
		System.out.printf("�߳�:%s ��ʼִ��...\n",name);
		//
		for(int i = 50;i<100;i+=10) {
			System.out.printf("�߳�%s ��ӡ %d\n", name, i);
		}
		//
		System.out.printf("�߳�%s ����.\n",name);
	}
	
}

