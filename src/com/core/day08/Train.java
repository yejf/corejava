/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day08;

/**
 * @author yejf
 *
 */
public class Train extends Vehicle implements CheckSpeed {

	public Train(int capacity, int speed, String name) {
		super(capacity, speed, name);
	}

	/* (non-Javadoc)
	 * @see com.core.day08.Movable#move(int)
	 */
	@Override
	public void move(int direction) {
		System.out.printf
			("һ���ؿ�[%d]�˵Ļ���[%d]��ʱ����[%s]��ȥ.\n"
					,getCapacity(),getSpeed(),convert(direction));
	}

}
