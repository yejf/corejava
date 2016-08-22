package com.core.day17;

/******
 * ����ThreadLocal ����װһ���̵߳ı�������ʹ������������̰߳�
 * һ���߳�ӵ��һ������������Ӱ��
 * @author yejf
 *
 */
public class IntegerThreadLocal {

	private static ThreadLocal<Integer> map = 
								new ThreadLocal<>();
	
	/*****
	 * ͨ��ThreadLocal������Ŀ������
	 * @return
	 */
	public static Integer getInt() {
		//���ȣ����ݵ�ǰ�߳���ƥ��
		Integer value = map.get();
		//�ж�
		if(value == null) {
			value = new Integer(1);
		}
		//��value+1��ֵ���ȥ
		map.set(value+1);
		//����
		return value;
	}
}

