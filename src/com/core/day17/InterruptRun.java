/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day17;

/**
 * @author yejf
 *
 */
public class InterruptRun implements Runnable {
	
	//����
	private String name; //�߳���
	private long time; //ģ��˯��ʱ��
	
	//���췽��
	public InterruptRun(String name, long time) {
		super();
		this.name = name;
		this.time = time;
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		//�����߳���
		Thread.currentThread().setName(this.name);
		//
		for (int i = 0; i < time; i++) {
			try {
				Thread.sleep(1000);
				System.out.printf("\t%s -> %d\n",this.name,i+1);
				
			} catch (InterruptedException e) {
				//e.printStackTrace();
				System.out.printf("\n�̡߳�%s�����ж���\n",this.name);
				// �˳�ѭ��
				break;
			}
		}
		System.out.printf("\n�߳�[%s] ����.\n",this.name);
	}

}
