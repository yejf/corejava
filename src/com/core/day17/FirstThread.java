/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day17;

/**
 * �߳��� 
 * @author yejf
 *
 */
public class FirstThread extends Thread {

	//��дrun����
	@Override
	public void run() {
		//��д�߳���Ҫִ�еĴ���
		//...
		String tname = getName();
		System.out.printf("�߳���:%s,�߳�ID��%d\n",tname,getId());
		//
		for(int i=0;i<10;i++) {
			//yield();
			System.out.printf("%s ��ӡ %d\n",tname,i+1);
		}
		//
		System.out.printf("�߳� %s ����\n",tname);
	}
}


