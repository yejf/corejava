/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day17;

/**
 * @author yejf
 *
 */
public class IntegerRun implements Runnable {
	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			//���δ�ӡ�������local�е�ֵ
			System.out.printf("%s -> %d\n", 
					Thread.currentThread().getName(),
					IntegerThreadLocal.getInt());
		}
	}

}
