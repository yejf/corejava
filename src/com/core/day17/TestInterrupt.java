/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day17;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yejf
 *
 */
public class TestInterrupt {

	public static void main(String[] args) {
		//����һ���������������еķ�main�߳�
		List<Thread> all = new ArrayList<>();
		//ѭ�������߳�
		for(int i=0;i<50;i++) {
			Runnable r = new InterruptRun("С"+(i+1), 5+i);
			//�����̲߳�����
			Thread t = new Thread(r);
			t.start();
			//���̴߳��뵽������
			all.add(t);
		}
		//��main�ȴ�t��ʼִ��
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		//�����������
		for(Thread t : all) {
			if(t.getName().equals("С1") 
					|| t.getName().equals("С4")) {
				System.out.printf
					("�߳�%s ��ʼ���߳�[%s]���ж���Ϣ.\n",
							Thread.currentThread().getName(),
							t.getName());
				//�����ж���Ϣ
				t.interrupt();
			}
		}
		// main�̵߳ȴ����е��߳̽����󣬲Ž���
		for(Thread t : all) {
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.printf("main�߳̽�����..\n");
	}
}
