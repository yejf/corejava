/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day08;

/**
 * @author yejf
 *
 */
public interface Movable {

	// ����
	int EAST = 1;
	int WEST = 2;
	int SOUTH = 3;
	int NORTH = 4;
	
	//����
	/****
	 * ��ȡ�ƶ����ٶ�
	 * @return
	 */
	int getSpeed();
	
	/****
	 * �ƶ���ָ���ķ���
	 * @param direction
	 */
	void move(int direction);
}


